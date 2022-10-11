package com.abby.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abby.mvcdemo.services.DonationService;
import com.abby.mvcdemo.services.UserService;

@Controller
public class HomeController {
	
	public final UserService userServ;
	public final DonationService donationServ;

	public HomeController(UserService userServ, DonationService donationServ) {
		this.userServ = userServ;
		this.donationServ = donationServ;
	}
	
	
	@GetMapping("/dashboard")
	public String index(Model model) {
		model.addAttribute("allDonations", donationServ.findAll());
		model.addAttribute("allUsers", userServ.findAll());
		return "main/dashboard.jsp";
	}

}
