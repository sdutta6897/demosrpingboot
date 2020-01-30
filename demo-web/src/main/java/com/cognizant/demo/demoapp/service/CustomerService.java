package com.cognizant.demo.demoapp.service;

import org.springframework.stereotype.Service;

import com.cognizant.demo.demoapp.dto.CustomerDTO;

/**
 * The class is a sample service which will invoke other services. dao's and any
 * web services.
 * 
 * @author sourav
 *
 */
@Service
public class CustomerService {
	
	public CustomerService() {
		System.out.println("test");
	}

	/**
	 * Save the customer to the database
	 * 
	 * @param customerDTO
	 */
	public boolean saveCustomer(CustomerDTO customerDTO) {
		return false;

	}
}
