package com.flightadmin.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flightadmin.models.*;

/**
 *
 *
 * @author Sahil Burade
 */
public interface FlightSearchRepository extends MongoRepository<Flight, String> {

	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	@Query("{'departure_location' : :#{#departure_location}, 'arrival_location' : :#{#arrival_location}}")
	List<Flight> findByData(@Param("departure_location") String departure_location,
			@Param("arrival_location") String arrival_location);

}
