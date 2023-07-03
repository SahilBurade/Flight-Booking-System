
package com.flightadmin.controller;

import java.util.Arrays;
import java.util.List;

import com.flightadmin.models.*;
import com.flightadmin.service.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author Sahil Burade
 */

@RestController
@RequestMapping("/manageFlight")
public class FlightAdminController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	/**
	 * Initialized the logger object
	 */
	private static Logger log = Logger.getLogger(FlightAdminController.class);

	/**
	 * FlightSearchServiceImpl Autowired
	 */

	@Autowired
	public FlightSearchServiceImpl service;

	/**
	 * Method to find all flights
	 */
	@GetMapping("/allFlights")
	public List<Flight> getAllFlights() {
		log.info("All flight details are fetched successfully.");
		return service.getAllFlights();
	}

	/**
	 * Method to add new flight
	 */
	@PostMapping("/addFlight")
	public String addNewFlight(@RequestBody Flight flight) {
		log.info("New Flight is added successfully.");
		return service.addFlight(flight);
	}

	/**
	 * Method to update flight
	 */
	@PutMapping("/updateFlight/{flight_number}")
	public String updateFlight(@RequestBody Flight flight, @PathVariable("flight_number") int flight_number) {
		log.info("The Flight is updated successfully.");
		return service.updateFlight(flight, flight_number);
	}

	/**
	 * Method to delete flight
	 */
	@DeleteMapping("/removeFlight/{flight_id}")
	public String removeFlight(@RequestBody Flight flight, @PathVariable("flight_id") int flight_id) {
		log.info("The flight is removed successfully.");
		return service.deleteFlight(flight, flight_id);
	}
}
