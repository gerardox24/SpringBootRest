package com.rest.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {

	List<T> findAll();
	
	T save(T s);
	
	T update(T s);
	
	Optional<T> findById(long id);
}
