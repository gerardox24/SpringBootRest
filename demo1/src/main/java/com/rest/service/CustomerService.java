package com.rest.service;

import java.util.List;

import com.rest.entity.Customer;

public interface CustomerService extends CrudService<Customer> {

	List<Customer> findByAge(int age);
}
