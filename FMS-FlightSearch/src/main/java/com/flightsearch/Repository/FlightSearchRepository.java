package com.flightsearch.Repository;

import com.flightsearch.models.*;
import com.flightsearch.models.*;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 *
 * @author Sahil Burade
 */
@Repository
public interface FlightSearchRepository extends MongoRepository<Flight, String> {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	@Query("{'departure_location' : :#{#departure_location}, 'arrival_location' : :#{#arrival_location}}")
	List<Flight> findByData(@Param("departure_location") String departure_location,
			@Param("arrival_location") String arrival_location);

	@Query("{'departure_location' : :#{#departure_location}, 'arrival_location' : :#{#arrival_location}, 'airline' : :#{#airline}}")
	Flight findByDataAndAirline(@Param("departure_location") String departure_location,
			@Param("arrival_location") String arrival_location, @Param("airline") String flightNumber);

}
