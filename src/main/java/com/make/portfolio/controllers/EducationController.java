package com.make.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EducationController {
	
	@GetMapping("/education")
	public String education() {
		return "achedemics";
	}

}
