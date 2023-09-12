package com.example.backend_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {  

	@GetMapping("/")
	public String index() {
		
		return "redirect:/index";
	}
}
