package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/test")
	public String testAPI() {

		return "Server Up and Running";
	}

	@GetMapping("/getUserDetails")
	public User getUserDetails() {

		User user = new User();
		return user;
	}

}
