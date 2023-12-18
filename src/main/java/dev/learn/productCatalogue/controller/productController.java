package dev.learn.productCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.learn.productCatalogue.Entity.product;
import dev.learn.productCatalogue.Entity.user;
import dev.learn.productCatalogue.repository.productRepo;
import dev.learn.productCatalogue.repository.userRepo;

@RestController

public class productController {
	
	@Autowired
	productRepo Prepo;
	@Autowired
	userRepo Urepo;
	
	@PostMapping("product/add")
	
	public ResponseEntity<product> add(@RequestBody product field ,@RequestParam int id)
	{
		
		 user userid=Urepo.findById(id).get();
		 String role=userid.getType();
		 if(role.equalsIgnoreCase("admin"))
		 {
			return ResponseEntity.ok(Prepo.save(field)); 
		 }
		 else
		 {
			 return ResponseEntity.status(405).build();
		 }
	}
	
	@GetMapping("product/getall")
	
	public ResponseEntity<List<product>> getall()
	{
		return ResponseEntity.ok(Prepo.findAll());
	}
	

}
