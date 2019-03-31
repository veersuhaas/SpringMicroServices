package com.example.microservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class Users {

	
	@RequestMapping(value="/list")
	public List<User> getUsers() {
		
		User u1 =new User("Veer", "Nalamothu", 5, "M");
		User u2 =new User("Suhaas", "Nalamothu", 5, "M");
		
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		return users;
	}
	
}
