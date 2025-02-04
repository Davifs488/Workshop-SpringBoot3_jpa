package com.API_estudo.daviDev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API_estudo.daviDev.entities.Order;
import com.API_estudo.daviDev.entities.User;
import com.API_estudo.daviDev.repositories.OrderRepository;
import com.API_estudo.daviDev.repositories.UserRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	

}
