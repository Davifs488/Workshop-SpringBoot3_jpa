package com.API_estudo.daviDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_estudo.daviDev.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
