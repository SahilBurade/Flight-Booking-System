package com.payment;

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
public class PaymentApplication {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

}
