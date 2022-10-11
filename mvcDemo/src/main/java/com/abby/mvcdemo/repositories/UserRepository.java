package com.abby.mvcdemo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abby.mvcdemo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();
	
	//creating a custom call of (find by email) from the CrudRepository
	Optional<User> findByEmail(String email);
}
