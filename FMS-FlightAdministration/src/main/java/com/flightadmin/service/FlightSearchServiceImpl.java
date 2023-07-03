package com.flightadmin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightadmin.Repository.*;
import com.flightadmin.models.*;
import com.flightadmin.service.*;

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
	
	@Autowired
	private FlightSearchRepository repo;

	/**
	 * Method to add flight
	 */
	@Override
	public String addFlight(Flight flight) {
		repo.save(flight);
		return "Added Flight:" + flight.getAirline() + flight.getFlight_number();
	}

	/**
	 * Method to update flight
	 */
	@Override
	public String updateFlight(Flight flight, int flight_number) {

		flight.setFlight_number(flight_number);
		repo.save(flight);
		return "Updated Flight:" + flight.getAirline() + flight.getFlight_number();
	}

	/**
	 * Method to delete flight
	 */
	@Override
	public String deleteFlight(Flight flight, int flight_id) {

		if (flight_id == flight.getId()) {
			repo.delete(flight);
		}
		return "Removed Flight:" + flight.getAirline() + flight.getFlight_number();
	}

	/**
	 * Method to fetch all flights
	 */
	@Override
	public List<Flight> getAllFlights() {

		return repo.findAll();
	}

}
