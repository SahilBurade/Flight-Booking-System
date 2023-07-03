package com.flightadmin.service;

import java.util.ArrayList;
import java.util.List;

import com.flightadmin.models.*;

/**
 *
 *
 * @author Sahil Burade
 */
public interface FlightSearchService {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	/**
	 * Method to add flight
	 */
	public String addFlight(Flight flight);

	/**
	 * Method to update flight
	 */

	public String updateFlight(Flight flight, int flight_number);

	/**
	 * Method to delete flight
	 */
	public String deleteFlight(Flight flight, int flight_id);

	/**
	 * Method to fetch flight
	 */
	public List<Flight> getAllFlights();

}
