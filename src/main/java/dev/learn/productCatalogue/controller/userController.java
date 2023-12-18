package dev.learn.productCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.learn.productCatalogue.Entity.user;
import dev.learn.productCatalogue.repository.userRepo;

@RestController

public class userController {
	@Autowired
	userRepo Urepo;
	
	@PostMapping("add/")
	
	public ResponseEntity<user> add(@RequestBody user field)
	{
		return ResponseEntity.ok(Urepo.save(field));
	}
	
	@GetMapping("getall/")
	
	public ResponseEntity<List<user>> get()
	{
	  return ResponseEntity.ok(Urepo.findAll());
	}
	

}
