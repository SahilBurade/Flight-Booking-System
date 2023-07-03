package com.youtube.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
*
*
* @author Sahil Burade
*/
@SpringBootApplication
@EnableEurekaClient
public class JwtYoutubeApplication {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

    public static void main(String[] args) {
        SpringApplication.run(JwtYoutubeApplication.class, args);
    }

}
