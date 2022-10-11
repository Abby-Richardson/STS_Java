package com.abby.dojosandninjas.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.dojosandninjas.models.Dojo;
import com.abby.dojosandninjas.services.DojoService;

@Controller
@RequestMapping ("/dojo")
public class DojoController {

	public final DojoService dojoServ;
	
	public DojoController(DojoService dojoServ) {
		this.dojoServ = dojoServ;
	}


	@GetMapping("/create")
	public String createDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "dojo/create.jsp";
	}
	
	@PostMapping("/create")
	public String processCreateDojo(
			@Valid @ModelAttribute("dojo")Dojo dojo,
			BindingResult result
			) {
		if (result.hasErrors()) {
			return "dojo/create.jsp";
		}
		dojoServ.create(dojo);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/display/{id}")
	public String displayDojo(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoServ.getDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojo/displayOne.jsp";
	}
	
}
