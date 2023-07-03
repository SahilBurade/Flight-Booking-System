package com.flightbooking.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flightbooking.Repository.FlightBookingRepository;
import com.flightbooking.models.Flight;
import com.flightbooking.models.FlightBooking;
import com.flightbooking.models.UserDetails;
import com.flightbooking.service.FlightBookingServiceImpl;

/**
 *
 *
 * @author Sahil Burade
 */
@RestController
@RequestMapping("/flightBooking")
public class BookingController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	/**
	 * Initialized the logger object
	 */
	private static Logger log = Logger.getLogger(BookingController.class);

	/**
	 * FlightBookingServiceImpl Autowired
	 */
	@Autowired
	public FlightBookingServiceImpl service;

	/**
	 * FlightBookingRepository Autowired
	 */
	@Autowired
	public FlightBookingRepository repo;

	/**
	 * Method to book flight
	 */
	@PostMapping("/book")
	public String addBooking(@RequestBody FlightBooking booking) {
		log.info("The flight is booked successfully.");
		return service.addFlightBooking(booking);
	}

	/**
	 * Method to fetch all bookings
	 */
	@GetMapping("/allBookings")
	public List<FlightBooking> getAllBookings() {
		log.info("All flight bookings are fetched successfully.");
		return repo.findAll();
	}

	/**
	 * Method to book flight with departure location , arrival location and airline
	 */
	@PostMapping("/book/{departure_location}/{arrival_location}/{airline}")
	public String addFlightBooking(@PathVariable("departure_location") String departure_location,
			@PathVariable("arrival_location") String arrival_location, @PathVariable("airline") String airline,
			@RequestBody UserDetails user) {

		String url = String.format("http://localhost:8090/flightSearch/find/%s/%s/%s", departure_location,
				arrival_location, airline);

		log.info("Flight booked successfully by their arrival location departure location and airline.");

		ResponseEntity<Flight> responseEntity = new RestTemplate().getForEntity(url, Flight.class);

		return service.createTicketBooking(responseEntity, user);
	}

}
