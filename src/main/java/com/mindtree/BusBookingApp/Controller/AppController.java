package com.mindtree.BusBookingApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.BusBookingApp.Entity.BookingDetails;
import com.mindtree.BusBookingApp.Entity.LogIn;
import com.mindtree.BusBookingApp.Entity.User;
import com.mindtree.BusBookingApp.Exceptions.NoRecordsFoundException;
import com.mindtree.BusBookingApp.Exceptions.ServiceExceptions;
import com.mindtree.BusBookingApp.Service.BookingDetailsService;
import com.mindtree.BusBookingApp.Service.LogInService;
import com.mindtree.BusBookingApp.Service.UserService;

@Controller
public class AppController 
{
	@Autowired
	BookingDetailsService details;
	@Autowired
	UserService userService;
	@Autowired
	LogInService loginService;
	
	@GetMapping("/")
	String display()
	{
		return "logIn";
	}
	
	@PostMapping("/index")
	String next(@ModelAttribute LogIn login)
	{
		this.loginService.addLogInDetails(login);
		return "index";
	}
	
	@PostMapping("/add")
	String add(Model model,@ModelAttribute BookingDetails bookingDetails)
	{
		model.addAttribute("get",this.details.addBookingDetails(bookingDetails));
		return "add";
	}
	
	@GetMapping("/findBySource")
	String showBySource()
	{
		return "search1";
	}
	
	@PostMapping("/listbysource")
	String getBySource(Model model,@RequestParam("sourceName") String source)
	{
		try {
			model.addAttribute("sourceList",this.details.searchBySource(source));
		} 
		catch (ServiceExceptions e) 
		{
			model.addAttribute("error", e.getMessage());
			return "exception";
		}
		return "bySource";
	}
	
	@GetMapping("/findByDestination")
	String showByDestination()
	{
		return "search2";
	}
	
	@PostMapping("/listbydestination")
	String showByDestination(Model model,@RequestParam("destinationName") String destination)
	{
		try {
			model.addAttribute("destinationList",this.details.searchByDestination(destination));
		}
		catch (ServiceExceptions e) 
		{
			model.addAttribute("error", e.getMessage());
			return "exception";
		}
		return "byDestination";
	}
	
	@GetMapping("/display")
	String showAll(Model model)
	{
		try {
			model.addAttribute("listAll",this.details.getDetails());
		} 
		catch (ServiceExceptions e) 
		{
			model.addAttribute("error", e.getMessage());
			return "exception";
		}
		return "allDetails";
	}
	
	@GetMapping("/delete/{id}")
	String deleteRecord(@PathVariable int id)
	{
		this.details.deleteBookingDetails(id);
		return "redirect:/display";
	}
	
	@GetMapping("/addUser")
	String showPage()
	{
		return "addUser";
	}
	@PostMapping("/showUser")
	String addUser(@ModelAttribute User user,Model model)
	{
		model.addAttribute("user",this.userService.addUser(user));
		return "showUser";
	}
//	@GetMapping("/showUser")
//	String showUser()
//	{
//		return "showUser";
//	}
	
	@PostMapping("/loggingIn")
	String check(@ModelAttribute LogIn login, Model model)
	{
		try {
			this.loginService.checkUser(login.getId(),login.getPassword());
		} 
		catch (NoRecordsFoundException e)
		{
			model.addAttribute("error",e.getMessage());
			return "exception";
		}
		return "index";
	}
	
	
	@GetMapping("/loggingIn/{id}/{password}")
	String checkU(@PathVariable String id,@PathVariable String password, Model model)
	{
		System.out.println(id);
		try {
			this.loginService.checkUser(id,password);
		} 
		catch (NoRecordsFoundException e)
		{
			model.addAttribute("error",e.getMessage());
			return "exception";
		}
		return "index";
	}
}
