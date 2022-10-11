package com.abby.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.dojosandninjas.models.Ninja;
import com.abby.dojosandninjas.services.DojoService;
import com.abby.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping ("/ninja")
public class NinjaController {
	
	public final NinjaService ninjaServ;
	public final DojoService dojoServ;

	public NinjaController(NinjaService ninjaServ, DojoService dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
	}

	
	@GetMapping("/new")
	public String newNinja(
			@ModelAttribute ("ninja")Ninja ninja, Model model
			) {
		model.addAttribute("allDojos", dojoServ.findAll());
		return "ninja/createForm.jsp";
	}
	
	@PostMapping("/new")
	public String processNewNinja(
			@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model model
			) {
		if (result.hasErrors()) {
			model.addAttribute("allDojos", dojoServ.findAll());
			return "ninja/createForm.jsp";
		}
		ninjaServ.create(ninja);
		return "redirect:/dashboard";
	}
	
}
