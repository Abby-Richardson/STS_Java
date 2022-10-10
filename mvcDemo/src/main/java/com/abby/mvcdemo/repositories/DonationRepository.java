package com.abby.mvcdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abby.mvcdemo.models.Donation;

@Repository //The Repository allows us to access built in methods that will execute our query calls for our model (middle man) between developer and JPA
public interface DonationRepository extends CrudRepository<Donation, Long>{
	List<Donation> findAll();
}
