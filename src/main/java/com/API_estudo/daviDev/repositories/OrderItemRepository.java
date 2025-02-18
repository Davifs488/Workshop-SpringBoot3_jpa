package com.API_estudo.daviDev.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.API_estudo.daviDev.entities.OrderItem;
import com.API_estudo.daviDev.entities.pk.OrderItemPK;



public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
