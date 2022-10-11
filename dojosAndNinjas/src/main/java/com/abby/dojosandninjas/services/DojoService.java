package com.abby.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abby.dojosandninjas.models.Dojo;
import com.abby.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	public final DojoRepository dojoRepo;
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}

	//find All
	public List<Dojo> findAll(){
		return dojoRepo.findAll();
	}
	
	//get one by id
	public Dojo getDojo(Long id) {
		Optional<Dojo> potentialDojo = dojoRepo.findById(id);
		return potentialDojo.isPresent() ? potentialDojo.get() : null;
	}

	//get one by name
	public Dojo getDojo (String name) {
		Optional<Dojo> potentialDojo = dojoRepo.findByName(name);
		return potentialDojo.isPresent() ? potentialDojo.get() : null;
	}
	//create
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
		
	}
}
