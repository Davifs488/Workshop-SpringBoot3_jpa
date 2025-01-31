package com.API_estudo.daviDev.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API_estudo.daviDev.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Mariola", "mar@yahoo.com", "66666666", "258963");
		
		return ResponseEntity.ok().body(u);
		
	}

}
