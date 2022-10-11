package com.abby.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abby.mvcdemo.models.User;
import com.abby.mvcdemo.repositories.UserRepository;

@Service
public class UserService {

	public final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	//find all
	public List<User>findAll(){
		return userRepo.findAll();
	}
	
	//get one by Id
	public User getUser(Long id) {
		Optional<User> potentialUser = userRepo.findById(id);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	//get one by email
	public User getUser(String email) {
		Optional<User> potentialUser = userRepo.findByEmail(email);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	//create
	public User create(User user) {
		return userRepo.save(user);
	}
}
