package com.abby.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abby.mvcdemo.models.Donation;
import com.abby.mvcdemo.models.User;
import com.abby.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	public final DonationService donationServ;
	
	public ApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	//------------FIND ONE (/donation/{id})----------------
	@GetMapping("/donations/{id}")
	public Donation findOne(@PathVariable("id")Long id) {
		return donationServ.getOne(id);
	}
	
	//------------EDIT (/donations/{id})-------------------
	@PutMapping("/donations/{id}")
	public Donation editOneDonation(@PathVariable("id")Long id, 
			@RequestParam("donationName")String donationName, 
			@RequestParam("donor")User donor, 
			@RequestParam("quantity")Integer quantity) {
		Donation donationToBeUpdated = donationServ.getOne(id);
		donationToBeUpdated.setDonationName(donationName);
		donationToBeUpdated.setDonor(donor);
		donationToBeUpdated.setQuantity(quantity);
		return donationServ.update(donationToBeUpdated);
	}
	
	//------------DELETE (/donations/{id})------------------
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable ("id") Long id) {
		donationServ.delete(id);
		if(donationServ.getOne(id) == null) {
			return "the donation you are looking for is not here";
		}
		return "The instance with the id of " + id + "has beenn deleted";
	}
	
	
	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.findAll();
	}
	
//	@PostMapping("/donations")
//	public Donation createDonation(
//			@RequestParam("donationName")String donationName, 
//			@RequestParam("donor")String donor, 
//			@RequestParam("quantity")Integer quantity) {
//		
//		Donation newDonation = new Donation(donationName, donor, quantity);
//		return donationServ.create(newDonation);
//	}
}
