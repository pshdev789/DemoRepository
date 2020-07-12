package com.example.demoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class DemoController {

	@GetMapping("/")
	public String renderHomePage(Model model) {

		return "homePage";
	}

}
