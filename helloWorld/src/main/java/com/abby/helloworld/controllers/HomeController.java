package com.abby.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoname", "Burbank");
		return "demo.jsp";
	}
	
	@RequestMapping("/new_route")
	public String newRoute() {
		return "Welcome!";
	}

}
