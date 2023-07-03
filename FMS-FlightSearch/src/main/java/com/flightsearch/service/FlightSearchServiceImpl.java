package com.flightsearch.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightsearch.models.*;
import com.flightsearch.service.*;
import com.flightsearch.Repository.*;

/**
 *
 *
 * @author Sahil Burade
 */
@Service
public class FlightSearchServiceImpl implements FlightSearchService {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
	/**
	 * FlightSearchService autowired
	 */
	@Autowired
	private FlightSearchRepository repo;

	/**
	 * Method to fetch all flights
	 */
	@Override
	public List<Flight> getAllFlights() {

		return repo.findAll();
	}

	/**
	 * Method for User to Search All Flights by Departure Location and Arrival
	 * Location
	 */
	@Override
	public ArrayList<Flight> getFlightByLocation(String departure_loc, String arrival_loc) {
		return (ArrayList<Flight>) repo.findByData(departure_loc, arrival_loc);
	}

	/**
	 * Method for User to Search All Flights by Departure Location and Arrival
	 * Location and Airline
	 */
	public Flight getFlightByLocationAndAirline(String departure_location, String arrival_location, String airline) {

		return (Flight) repo.findByDataAndAirline(departure_location, arrival_location, airline);
	}

}
