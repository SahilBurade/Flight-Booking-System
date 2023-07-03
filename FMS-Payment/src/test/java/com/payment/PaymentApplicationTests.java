package com.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.when;
import com.payment.controller.*;
import com.payment.models.TransactionDetails;
import com.payment.service.PaymentServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
//import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
public class PaymentApplicationTests {
	
	
	@Mock
	private PaymentServiceImpl service;
	
	@InjectMocks
	private PaymentController searchController;
	
	 @Test
	 void contextLoads() {

	 }
	 
	 
	    @BeforeEach
	    public void setUp() {
	       
	    }


	 
  }

	
	
	
