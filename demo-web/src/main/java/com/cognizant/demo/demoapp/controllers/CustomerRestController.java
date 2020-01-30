package com.cognizant.demo.demoapp.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.demo.demoapp.dto.CustomerDTO;
import com.cognizant.demo.demoapp.model.CustomerRequestModel;
import com.cognizant.demo.demoapp.model.CustomerResponseModel;
import com.cognizant.demo.demoapp.service.CustomerService;
import com.cognizant.demo.demoapp.utility.LogMethodPoint;

/**
 * 
 * Demo rest controller APIs
 * 
 * @author sourav.dutta5@cognizant.com
 *
 */
@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	/**
	 * Save the passed on customer information to the database
	 * 
	 * @param customerRequestModel
	 * @return
	 */
	@RequestMapping(path = "/customers", method = RequestMethod.POST)
	@LogMethodPoint
	public CustomerResponseModel saveCustomerDetails(@RequestBody CustomerRequestModel customerRequestModel) {
		CustomerResponseModel customerResponseModel = null;
		CustomerDTO customerDTO = new CustomerDTO();
		BeanUtils.copyProperties(customerRequestModel, customerDTO);
		boolean isSuccess = customerService.saveCustomer(customerDTO);
		if (isSuccess) {
			customerResponseModel = new CustomerResponseModel();
			customerResponseModel.setSuccessIndicator(true);
			customerResponseModel.getMessages().add("Customer addition was succesful");
		} else {
			customerResponseModel = new CustomerResponseModel();
			customerResponseModel.setSuccessIndicator(true);
			customerResponseModel.getMessages().add("Customer addition was not succesful");
		}
		return customerResponseModel;

	}

}
