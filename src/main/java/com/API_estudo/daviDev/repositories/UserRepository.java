package com.API_estudo.daviDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_estudo.daviDev.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
