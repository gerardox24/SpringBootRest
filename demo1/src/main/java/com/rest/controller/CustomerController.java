package com.rest.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest.entity.Customer;
import com.rest.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/customer") // uri: identificador de recurso universal
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// GET
	@GetMapping
	public ResponseEntity<List<Customer>> listCustomers() {
		List<Customer> customers = new ArrayList<>();
		customers = customerService.findAll();

		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	// POST
	@PostMapping
	public ResponseEntity<Object> saveCustomer(@RequestBody Customer customer) {

		Customer cus = new Customer();
		cus = customerService.save(customer);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cus.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	// PUT
	// @PutMapping
	// DELETE
	// @DeleteMapping
}
