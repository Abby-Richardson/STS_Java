package com.abby.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abby.savetravels.models.Expense;
import com.abby.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	public final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	public List<Expense> findAll(){
		return expenseRepo.findAll();
	}
	
	public Expense create(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public Expense update(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public void delete(Long id) {
		expenseRepo.deleteById(id);
	}
	
	
	public Expense getOne(Long id) {
		return expenseRepo.findById(id).isPresent() ? expenseRepo.findById(id).get() : null;
		
	}
}
