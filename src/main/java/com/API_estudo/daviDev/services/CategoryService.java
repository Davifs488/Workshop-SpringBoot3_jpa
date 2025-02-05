package com.API_estudo.daviDev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API_estudo.daviDev.entities.Category;
import com.API_estudo.daviDev.entities.User;
import com.API_estudo.daviDev.repositories.CategoryRepository;
import com.API_estudo.daviDev.repositories.UserRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		
		
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	

}
