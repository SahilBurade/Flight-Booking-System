 package com.payment.controller;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import com.payment.models.TransactionDetails;
import com.payment.service.PaymentServiceImpl;


/**
*
*
* @author Sahil Burade
*/
@RestController
@RequestMapping("/payment")
public class PaymentController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
	
	/**
	 * Initialized the logger object
	 */
	
	private static Logger log = Logger.getLogger(PaymentController.class);
		
	/**
	 * PaymentServiceImpl autowired
	 */
	@Autowired
	public PaymentServiceImpl service;
	
	

	/**
	 * Method to create transaction
	 */
	@GetMapping("/createTransaction/{amount}")
	public TransactionDetails createTransaction(@PathVariable("amount")Double amount) {
		log.info("Transaction is created successfully");
		return  service.createTransaction(amount);
		
	}
	
	 
	
	
	
}
