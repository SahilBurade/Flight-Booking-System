package com.flightbooking.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flightbooking.models.*;
/**
*
*
* @author Sahil Burade
*/
public interface FlightBookingRepository extends MongoRepository<FlightBooking,String>{
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

}
