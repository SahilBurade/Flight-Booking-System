package com.flightbooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flightbooking.Repository.*;
import com.flightbooking.models.*;
import com.flightbooking.service.*;

/**
 *
 *
 * @author Sahil Burade
 */
@Service
public class FlightBookingServiceImpl implements FlightBookingService {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	/**
	 * FlightBookingRepository Autowired
	 */
	@Autowired
	private FlightBookingRepository repo;

	/**
	 * Method to add flight booking
	 */
	@Override
	public String addFlightBooking(FlightBooking booking) {
		repo.save(booking);
		return "Flight Booked with BookingId :" + booking.getBookingId();

	}

	/**
	 * Method to create ticket booking
	 */
	public String createTicketBooking(ResponseEntity<Flight> responseEntity, UserDetails user) {

		Flight flightobj = responseEntity.getBody();
		FlightBooking booking = new FlightBooking();

		booking.setArrival_location(flightobj.getArrival_location());
		booking.setDeparture_location(flightobj.getDeparture_location());
		booking.setAirline(flightobj.getAirline());
		booking.setFlight_number(flightobj.getFlight_number());
		booking.setName(user.getName());
		booking.setGender(user.getGender());
		booking.setAge(user.getAge());
		booking.setSeatNo(user.getSeatNo());

		repo.save(booking);

		return "Flight Booked with BookingId :" + booking.getBookingId();
	}

}
