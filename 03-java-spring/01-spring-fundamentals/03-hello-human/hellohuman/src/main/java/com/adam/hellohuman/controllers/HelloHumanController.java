package com.adam.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloHumanController {
    @RequestMapping("/")
	public String index(
			@RequestParam (value="name", required = false, defaultValue = "Human") String name, 
			@RequestParam (value="last_name", required = false, defaultValue = "") String lastName,
			@RequestParam (value="times", required = false) String times,
			Model model)
	{
		model.addAttribute("name", name);
		model.addAttribute("last_name", lastName);
		model.addAttribute("times", times);
		return "index.jsp";
	}
}
