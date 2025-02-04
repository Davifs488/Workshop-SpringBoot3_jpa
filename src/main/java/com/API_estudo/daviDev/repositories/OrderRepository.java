package com.API_estudo.daviDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_estudo.daviDev.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
