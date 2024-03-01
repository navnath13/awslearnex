package com.user.user_serivce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.user.user_serivce.entity.User;
import com.user.user_serivce.service.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServices userServices;
	
	
    @Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userServices.getUser(userId);
		List contact = restTemplate.getForObject("http://localhost:9002/contact/"+user.getUserId(),List.class);
		
		user.setContact(contact);


	   return user; 
	}


}
