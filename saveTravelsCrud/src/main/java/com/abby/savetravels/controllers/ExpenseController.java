package com.abby.savetravels.controllers;

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

import com.abby.savetravels.models.Expense;
import com.abby.savetravels.services.ExpenseService;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

	public final ExpenseService expenseServ;
	public ExpenseController(ExpenseService expenseServ) {
		this.expenseServ = expenseServ;
	}

	@GetMapping("/all")
	public String showAllExpenses(Model model) {
		model.addAttribute("allExpenses", expenseServ.findAll());
		return "/expense/index.jsp";
	}
	
	@GetMapping("/show/{id}")
	public String showOneExpense(@PathVariable("id")Long id, Model model) {
		model.addAttribute("oneExpense", expenseServ.getOne(id));
		return "/expense/showOne.jsp";
	}
	
	@GetMapping("/new")
	public String newExpense(@ModelAttribute("expense")Expense expense) {
		return "expense/createForm.jsp";
	}
	
	@PostMapping("/new")
	public String processNewExpense(
		@Valid @ModelAttribute("expense")Expense expense, BindingResult result) { 
		if (result.hasErrors()) {
			return "expense/createForm.jsp";
		}
		expenseServ.create(expense);
		return "redirect:/expense/all";
	}
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id")Long id, Model model) {
		Expense expense = expenseServ.getOne(id);
		model.addAttribute("expense", expense);
		return "expense/editForm.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String processEditExpense(
		@Valid @ModelAttribute("expense")Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "expense/editForm.jsp";
		}
		expenseServ.update(expense);
		return "redirect:/expense/all";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable("id")Long id) {
		expenseServ.delete(id);
		return "redirect:/expense/all";
	}
	

}
