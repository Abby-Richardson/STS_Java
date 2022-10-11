package com.abby.mvcdemo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.mvcdemo.models.User;
import com.abby.mvcdemo.services.UserService;

@Controller
@RequestMapping ("/user")
public class UserController {
	
	public final UserService userServ;

	public UserController(UserService userServ) {
		this.userServ = userServ;
	}

	
	@GetMapping("/create")
	public String createUser(@ModelAttribute("user")User user) {
		return "user/create.jsp";
	}
	
	@PostMapping("/create")
	public String processCreateUser(
			@Valid @ModelAttribute("user")User user, 
			BindingResult result
			) {
		if (result.hasErrors()) {
			return "user/create.jsp";
		}
		userServ.create(user);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/display/{id}")
	public String displayUser(@PathVariable("id")Long id, Model model) {
		User user = userServ.getUser(id);
		model.addAttribute("user", user);
		return "user/displayOne.jsp";
	}
}
