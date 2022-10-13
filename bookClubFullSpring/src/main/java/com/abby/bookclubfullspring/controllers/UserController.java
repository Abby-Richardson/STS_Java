package com.abby.bookclubfullspring.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.bookclubfullspring.models.LoginUser;
import com.abby.bookclubfullspring.models.User;
import com.abby.bookclubfullspring.services.UserService;



@Controller
@RequestMapping ("/user")
public class UserController {
	
	public final UserService userServ;

	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/login/register")
	public String loginRegisterUser(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "user/loginReg.jsp";
	}
	
	@PostMapping("/register")
	public String registerUser(
			@Valid @ModelAttribute("newUser") User newUser, 
			BindingResult result, 
			Model model, 
			HttpSession session
			) {
		//reject if email is already taken
		if(userServ.getUser(newUser.getEmail()) !=null ) {
			result.rejectValue("email", "Unique", "Email already in use!!");
		}
		
		
		//reject if password doesn't match confirmation
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Match", "Passwords need to match!");
		}
		if (result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "user/loginReg.jsp";
		}
		User createdUser = userServ.registerUser(newUser);
		session.setAttribute("user_id", createdUser.getId());
		return "redirect:/dashboard";
	}
	
	@PostMapping("/login")
	public String loginUser(
			@Valid @ModelAttribute("loginUser") LoginUser loginUser, 
			BindingResult result, 
			Model model, 
			HttpSession session
			) {
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "user/loginReg.jsp";
		}
		User foundUser = userServ.login(loginUser, result);
		if(foundUser == null) {
			model.addAttribute("newUser", new User());
			return "user/loginReg.jsp";
		}
		session.setAttribute("user_id", foundUser.getId());
		return "redirect:/dashboard";
	}
	
	@GetMapping("/logout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
