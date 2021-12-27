package com.adam.languages.controllers;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.adam.languages.models.Languages;
import com.adam.languages.services.LanguageService;

@Controller
public class HomeController {
    // @Autowired
	private LanguageService languageService;
	
	@GetMapping("/")
	public String getLanguage(Model model) {
		System.out.println("getting languages");
		List<Languages> languages = languageService.getAllLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String createLanguage(Languages language) {
		languageService.create(language);
		return "redirect:/";
		
	}
	@GetMapping("/{id}")
	public String getLanguageid(@PathVariable("id") Long id,Model model) {
		Languages language = languageService.getLanguageById(id);
		model.addAttribute("language", language);
		return "info.jsp";
	}
	@GetMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		languageService.delete(id);
		return "redirect:/";
	}
	@GetMapping("/languages/{id}/edit")
	public String editLanguage(@PathVariable("id") Long id , Model model) {
		Languages language = languageService.getLanguageById(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
}
