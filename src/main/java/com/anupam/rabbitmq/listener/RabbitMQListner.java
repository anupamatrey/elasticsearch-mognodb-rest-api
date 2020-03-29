/**
 * 
 */
package com.anupam.rabbitmq.listener;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anupam.elasticsearch.repository.CustomerRepository;
import com.anupam.json.object.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Anupam Sharma
 *
 */
@Service
public class RabbitMQListner {
	@Autowired
	CustomerRepository repository;

	public void receiveMessage(byte[] message) {
		try {
			Customer customer = new ObjectMapper().readValue(message, Customer.class);
			repository.save(customer);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
