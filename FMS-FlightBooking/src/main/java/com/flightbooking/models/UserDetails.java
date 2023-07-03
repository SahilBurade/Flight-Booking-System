package com.flightbooking.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author Sahil Burade
 */
public class UserDetails {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	@NotNull(message="Name should not be null")
	private String name;
	@NotNull(message="gender should not be null")
	private String gender;
	@Min(18)
	private int age;
	@NotNull(message="Seat No should not be null")
	private int seatNo;

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

	public UserDetails(String name, String gender, int age, int seatNo) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.seatNo = seatNo;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
