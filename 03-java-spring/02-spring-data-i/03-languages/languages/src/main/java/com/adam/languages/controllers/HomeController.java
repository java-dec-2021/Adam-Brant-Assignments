package com.adam.languages.controllers;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
    @GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
