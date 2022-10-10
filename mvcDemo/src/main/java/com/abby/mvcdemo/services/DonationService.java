package com.abby.mvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abby.mvcdemo.models.Donation;
import com.abby.mvcdemo.repositories.DonationRepository;

@Service //need to identify with a bean
public class DonationService {
//DonationService is going to grab the methods within our CrudRepository and we're going to run logic and then use those methods
	
	public final DonationRepository donationRepo;
	
	
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
		//this allows us to use the methods within our DonationRepo
	}

	public List<Donation> findAll() {
			return donationRepo.findAll();
	}
	
	public Donation create(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public Donation update(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public void delete(Long id) {
		donationRepo.deleteById(id);
	}
	
	public Donation getOne(Long id) {
		return donationRepo.findById(id).isPresent()? donationRepo.findById(id).get():null;
		
//		Optional<Donation> optionalDonation = donationRepo.findById(id);
//		if (optionalDonation.isPresent()) {
//			return optionalDonation.get();
//		} else {
//			return null;
//		}
	}
}
