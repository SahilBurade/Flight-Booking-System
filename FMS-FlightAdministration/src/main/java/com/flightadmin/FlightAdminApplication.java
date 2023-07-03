package com.flightadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
*
*
* @author Sahil Burade
*/
@SpringBootApplication
@EnableEurekaClient
public class FlightAdminApplication {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	public static void main(String[] args) {
		SpringApplication.run(FlightAdminApplication.class, args);
	}
	
}


//Swagger 3 AKA OpenAPI
//We have implemented openAPI inPlace of swagger it just the updated version of swagger.
//OpenAPI is api documentation tool just like swagger. Till version 2 it was known as swagger after that it is known as openAPI 
//from version 3 onwards.
