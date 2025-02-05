package com.API_estudo.daviDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_estudo.daviDev.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
