package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/user")
	public void insertUser(@RequestBody UserDto userDto) {
		userservice.insert(userDto);
	}

}
