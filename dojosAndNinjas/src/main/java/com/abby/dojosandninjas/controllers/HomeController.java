package com.abby.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abby.dojosandninjas.services.DojoService;
import com.abby.dojosandninjas.services.NinjaService;

@Controller
public class HomeController {
	
	public final DojoService dojoServ;
	public final NinjaService ninjaServ;
	
	public HomeController(DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
	
	@GetMapping("/dashboard")
	public String index(Model model) {
		model.addAttribute("allNinjas", ninjaServ.findAll());
		model.addAttribute("allDojos", dojoServ.findAll());
		return "main/dashboard.jsp";
	}
	
}
