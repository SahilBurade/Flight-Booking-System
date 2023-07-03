 package com.flightsearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import com.flightsearch.models.Flight;
import com.flightsearch.service.FlightSearchServiceImpl;

/**
 *
 *
 * @author Sahil Burade
 */
@RestController
@RequestMapping("/flightSearch")
public class SearchController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	/**
	 * Initialized the logger object
	 */
	private static Logger log = Logger.getLogger(SearchController.class);
	/**
	 * FlightSearchServiceImpl autowired
	 */
	@Autowired
	public FlightSearchServiceImpl service;

	/**
	 * Method to get all flights
	 */
	@GetMapping("/allFlights")
	public List<Flight> getAllFlights() {
		log.info("All flight details are fetched successfully.");
		return service.getAllFlights();
	}

	/**
	 * Method to find flights with departuure and arrival location
	 */
	@GetMapping("/find/{departure_location}/{arrival_location}")
	public List<Flight> getFlightByData(@PathVariable("departure_location") String dep_loc,
			@PathVariable("arrival_location") String arr_loc) {
		log.info("All flight details are fetched successfully by their arrival location and departure location.");
		return service.getFlightByLocation(dep_loc, arr_loc);
	}

	/**
	 * Method to get all flight with departure location , arrival location and airline 
	 */
	@GetMapping("/find/{departure_location}/{arrival_location}/{airline}")
	public Flight getFlightByDataAndAirline(@PathVariable("departure_location") String dep_loc,
			@PathVariable("arrival_location") String arr_loc, @PathVariable("airline") String airline) {
		log.info(
				"All flight details are fetched successfully by their arrival location , departure location and airline.");
		return service.getFlightByLocationAndAirline(dep_loc, arr_loc, airline);
	}

}
