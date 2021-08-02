package com.biswa.learning.sws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId) {
		return "get user called" + userId;
	}
	@PostMapping
	public String createUser() {
		return "create user called";
	}
	@PutMapping
	public String updateUser() {
		return "update user called";
	}
	@DeleteMapping
	public String deletUser() {
		return "delete user called";
	}
	

}
