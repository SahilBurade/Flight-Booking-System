package com.flightsearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.when;
import com.flightsearch.Repository.*;
import com.flightsearch.controller.*;
import com.flightsearch.models.Flight;
import com.flightsearch.service.FlightSearchServiceImpl;

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
public class FlightSearchApplicationTests {
	
//    @Mock
//	private FlightSearchRepository repository; 
//	 @Autowired
//	 private SearchController control;
	
	@Mock
	private FlightSearchServiceImpl service;
	
	@InjectMocks
	private SearchController searchController;
	
	 @Test
	 void contextLoads() {

	 }
	 
//	   @Test
//		public void getFlight(){
//		when(repository.findAll()).thenReturn(Stream.of(new Search("2","Note","hyd","delhi")).collect(Collectors.toList()));
//		assertEquals(1,control.getBooks().size());
//		}
	 
//	 @Test
//	 @DisplayName("Should Pass when output contains all the flights")
//	 void checkAllFlights() {
//		 
//		 FlightSearchServiceImpl service = new F
//	 }
	 
	    @BeforeEach
	    public void setUp() {
	       
	    }

	    @Test
	    public void testGetAllFlights() {
	        // Mock the service to return a list of flights
	        List<Flight> flights = Arrays.asList(
	            new Flight(1,"Mumbai","Nagpur","IndiGo",13,"6:30 PM","8:15 PM"),
	            new Flight(1,"Mumbai","Nagpur","SpiceJet",17,"6:30 PM","8:15 PM")
	            
	        );
	        Mockito.when(service.getAllFlights()).thenReturn(flights);

	        // Call the method
	        List<Flight> result = searchController.getAllFlights();

	        // Assert the result
	        Assertions.assertEquals(flights, result);
	    }
	 
	 
	 
  }

	
	
	
