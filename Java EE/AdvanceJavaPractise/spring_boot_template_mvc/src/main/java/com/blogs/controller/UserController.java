package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.blogs.entities.Role;
import com.blogs.entities.User;
import com.blogs.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	// add a method for processing login form
	@PostMapping("/login")
//	@RequestParam : mathod arg level annotation to bind request parameters to method args Done auto
//	by SC should match req parameter name to method arg name
//	To bind request parameters to the method arguments of the request handling method
	//String jpql = "select u from User where email=:em and password=:pwd";	
	//SC : email =Double.parseDouble(request.getParameter("price"))
	
	public String processLoginForm(@RequestParam String email, @RequestParam String password,Model map,HttpSession session) {
//	public String processLoginForm(@RequestParam(name = "email") String em,@RequestParam String password ) {
		System.out.println("in process login form");
		try {
			// invoke service layer method
			User user = userService.signInUser(email, password);
			
			//=> login successful
			//add user details n mesaage -- under model attribute
//			map.addAttribute("message","Login Succesful")
//			.addAttribute("user_details",user); //request scope
			
			session.setAttribute("message","Login Succesful");
			session.setAttribute("user_details",user);
			
			//chk the role --in case of admin -- forward the clnt admin 
			if(user.getRole()==Role.ADMIN)
				return "redirect:/admin/home";
			
			//SC : response.sendRedirect(response.encodeRedirectURL)
			//SC : redirect + URL encoding
			//Next URL -- http://host:port/spring_boot/admin/home
			
			//o.w. role --in case of blogger -- forward the clnt blogger
			return "/blogger/home";
			//SC : redirect + URL encoding
			//Next URL -- http://host:port/spring_boot/blogger/home
			
		} catch (RuntimeException e) {
			System.out.println("err" + e);	
			// ==> invalid login, forward the clnt tom the login form,
			// highlighted with errors
			map.addAttribute("message",e.getMessage());
			return "/users/login"; // AVN: /WEB-INF/views/users/login
		}
	}
}
