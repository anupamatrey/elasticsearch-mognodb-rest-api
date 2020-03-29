/**
 * 
 */
package com.anupam.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anupam.elasticsearch.repository.CustomerRepository;
import com.anupam.json.object.CommunicationInfo;
import com.anupam.json.object.Customer;

/**
 * @author Anupam Sharma
 *
 */
@RestController
@RequestMapping("/customer")
public class ApplicationController {
	@Autowired
	CustomerRepository repository;
	
	@GetMapping("/{id}")
	public Optional<Customer> findByName(@PathVariable("id") String id) {
		return repository.findById(id);
	}

}
