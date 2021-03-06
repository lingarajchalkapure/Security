package com.javatpoint.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String privateHome() {
		return "privatepage";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logoutPage(HttpServletRequest request,HttpServletResponse response) {
	
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		System.err.println("authentication modification ======= "+authentication);
		
		if (authentication!=null) {
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		} 
		
		return "redirect:/admin";
		
	}
	
}
