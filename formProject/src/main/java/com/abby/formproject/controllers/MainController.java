package com.abby.formproject.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/omikuji/form")
	public String processForm(
			@RequestParam("number")Integer number,
			@RequestParam("city")String city, 
			@RequestParam("name")String name,
			@RequestParam("hobby")String hobby,
			@RequestParam("thing")String thing,
			@RequestParam("something")String something,
			HttpSession session) 
			{
			session.setAttribute("number", number);
			session.setAttribute("city", city);
			session.setAttribute("name", name);
			session.setAttribute("hobby", hobby);
			session.setAttribute("thing", thing);
			session.setAttribute("something", something);
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String show() {
		return "results.jsp";
	}
}
