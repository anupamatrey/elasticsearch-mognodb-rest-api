/**
 * 
 */
package com.anupam.elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.anupam.json.object.Customer;

@Repository
public interface CustomerRepository extends ElasticsearchCrudRepository<Customer, String>{
	//List<CommunicationInfo> findByEmail(String email);

}
