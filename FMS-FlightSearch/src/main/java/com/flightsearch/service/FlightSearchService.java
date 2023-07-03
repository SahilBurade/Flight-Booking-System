package com.flightsearch.service;

import java.util.ArrayList;
import java.util.List;
import com.flightsearch.models.*;

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
	 * Method to get all flights
	 */
	public List<Flight> getAllFlights();

	/**
	 * Method to get flights with departure location and arrival location
	 */
	public ArrayList<Flight> getFlightByLocation(String depature_loc, String arrival_loc);

	/**
	 * Method to get flights with departure location and arrival location and
	 * airline
	 */
	public Flight getFlightByLocationAndAirline(String departure_location, String arrival_location, String airline);

}
