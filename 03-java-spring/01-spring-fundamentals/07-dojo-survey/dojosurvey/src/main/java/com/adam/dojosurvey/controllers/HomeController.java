package com.adam.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/result")
	public String result(
            @RequestParam(value = "firstName") String firstName, 
			@RequestParam(value = "location") String dojoLocation,
			@RequestParam(value = "language") String favoriteLanguage,
			@RequestParam(value = "comment", required = false) String Comment, Model model)
            {
                model.addAttribute("firstName", firstName);
                model.addAttribute("location", dojoLocation);
                model.addAttribute("language", favoriteLanguage);
                model.addAttribute("comment", Comment);
                return "result.jsp";
            }
}