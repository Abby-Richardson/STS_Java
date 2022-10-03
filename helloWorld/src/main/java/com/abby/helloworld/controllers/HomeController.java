package com.abby.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello Abby!";
	}
	
	@RequestMapping("/new_route")
	public String newRoute() {
		return "Welcome!";
	}

}
