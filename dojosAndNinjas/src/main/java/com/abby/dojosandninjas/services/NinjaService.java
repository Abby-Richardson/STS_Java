package com.abby.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abby.dojosandninjas.models.Ninja;
import com.abby.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	public final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	//find all
	public List<Ninja> findAll() {
		return ninjaRepo.findAll();
	}
	
	//create
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	//edit
	public Ninja update(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	//delete
	public void delete(Long id) {
		ninjaRepo.deleteById(id);
	}
	
	//get by id
	public Ninja getOne(Long id) {
		return ninjaRepo.findById(id).isPresent()? ninjaRepo.findById(id).get():null;
	}
}
