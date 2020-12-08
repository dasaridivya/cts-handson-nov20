package com.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Customer;

// Note: You will not use @Repository, because repository is implemented by springboot

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
