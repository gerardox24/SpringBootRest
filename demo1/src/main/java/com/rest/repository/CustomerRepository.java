package com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findByAge(int age);
}
