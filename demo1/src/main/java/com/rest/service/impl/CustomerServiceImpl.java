package com.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.rest.entity.Customer;
import com.rest.repository.CustomerRepository;
import com.rest.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer save(Customer s) {
		// TODO Auto-generated method stub
		return customerRepository.save(s);
	}

	@Override
	public Customer update(Customer s) {
		// TODO Auto-generated method stub
		return customerRepository.save(s);
	}

	@Override
	public Optional<Customer> findById(long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public List<Customer> findByAge(int age) {
		// TODO Auto-generated method stub
		return customerRepository.findByAge(age);
	}

}
