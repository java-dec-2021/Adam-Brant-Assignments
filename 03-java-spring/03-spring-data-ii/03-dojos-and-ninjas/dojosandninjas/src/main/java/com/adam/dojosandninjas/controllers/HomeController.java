package com.adam.dojosandninjas.controllers;

import javax.validation.Valid;

import com.adam.dojosandninjas.models.Dojo;
import com.adam.dojosandninjas.models.Ninja;
import com.adam.dojosandninjas.services.DojoService;
import com.adam.dojosandninjas.services.NinjaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private NinjaService nService;
    @Autowired
    private DojoService dService;

    @GetMapping("/")
    public String dashBoard(Model model){
        model.addAttribute("dojos", dService.getAlldojos());
        return "dashboard.jsp";
    }
    @GetMapping("/newninja")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja){
        return "newninja.jsp";
    }
    @PostMapping("/createninja")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if(result.hasErrors()){
            return "newninja.jsp";
        }else{
            return "redirect:/";
        }
    }
    @GetMapping("/newdojo")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo){
        return "newdojo.jsp";
    }
    @PostMapping("/createdojo")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
        if(result.hasErrors()){
            return "newdojo.jsp";
        }else{
            return "redirect:/";
        }
    }
}
