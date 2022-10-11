package com.abby.mvcdemo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.mvcdemo.models.Donation;
import com.abby.mvcdemo.services.DonationService;
import com.abby.mvcdemo.services.UserService;


@Controller
@RequestMapping("/donation")
public class DonationController {

	public final DonationService donationServ;
	public final UserService userServ;
	public DonationController(DonationService donationServ, UserService userServ) {
		this.donationServ = donationServ;
		this.userServ = userServ;
	}
	
	@GetMapping("/all")
	public String showAllDonations(Model model) {
		model.addAttribute("allDonations", donationServ.findAll());
		return "donation/showAll.jsp";
	}
	
	@GetMapping("/show/{id}")
	public String showOneDonation(@PathVariable("id")Long id, Model model) {
		model.addAttribute("oneDonation", donationServ.getOne(id));
		return "donation/showOne.jsp";
	}
	
	@GetMapping("/new")
	public String newDonation(
			@ModelAttribute("donation") Donation donation, Model model
			) {
		model.addAttribute("allUsers", userServ.findAll());
		return "donation/createForm.jsp";
	}
	
	@PostMapping("/new")
	public String processNewDonation (
			@Valid @ModelAttribute("donation")Donation donation, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allUsers", userServ.findAll());
			return "donation/createForm.jsp";
		}
		donationServ.create(donation);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editDonation(@PathVariable("id")Long id, Model model) {
		Donation donation = donationServ.getOne(id);
		model.addAttribute("donation", donation);
		return "donation/editForm.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String processEditDonation(@Valid @ModelAttribute("donation")Donation donation, BindingResult result) {
		if(result.hasErrors()) {
			return "donation/editForm.jsp";
		}
		donationServ.update(donation);
		return "redirect:/donation/all";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDonation(@PathVariable("id")Long id) {
		donationServ.delete(id);
		return "redirect:/donation/all";
	}
	
	@GetMapping("/all/new")
	public String showAllWithCreate(@ModelAttribute("donation")Donation donation, Model model) {
		model.addAttribute("allDonations", donationServ.findAll());
		return "donation/showAllWithCreate.jsp";
	}
	
	
}
