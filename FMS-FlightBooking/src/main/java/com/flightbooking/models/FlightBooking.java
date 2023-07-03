package com.flightbooking.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 *
 * @author Sahil Burade
 */
@Document(collection = "flightBooking")
public class FlightBooking {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
	@Id
	private String bookingId;
	@NotNull(message="Name should not be null")
	private String name;
	@NotNull(message="Gender should not be null")
	private String gender;
	@Min(18)
	private int age;
	@NotNull(message="Seat No should not be null")
	private int seatNo;
	@NotNull(message="Departure Location should not be null")
	private String departure_location;
	@NotNull(message="Arrival Location should not be null")
	private String arrival_location;
	@NotNull(message="Airline should not be null")
	private String airline;
	@NotNull(message="Flight Number should not be null")
	@Positive
	private int flight_number;

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getDeparture_location() {
		return departure_location;
	}

	public void setDeparture_location(String departure_location) {
		this.departure_location = departure_location;
	}

	public String getArrival_location() {
		return arrival_location;
	}

	public void setArrival_location(String arrival_location) {
		this.arrival_location = arrival_location;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}

	public FlightBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightBooking(String bookingId, String name, String gender, int age, int seatNo, String departure_location,
			String arrival_location, String airline, int flight_number) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.seatNo = seatNo;
		this.departure_location = departure_location;
		this.arrival_location = arrival_location;
		this.airline = airline;
		this.flight_number = flight_number;
	}

}
