package com.youtube.jwt.controller;

import com.youtube.jwt.entity.JwtRequest;
import com.youtube.jwt.entity.JwtResponse;
import com.youtube.jwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author Sahil Burade
 */
@RestController
@CrossOrigin
public class JwtController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
	
	
	/**
	 * JwtService autowired
	 */
	@Autowired
	private JwtService jwtService;
	/**
	 * Method to authenticate the user
	 */
	@PostMapping({ "/authenticate" })
	public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		return jwtService.createJwtToken(jwtRequest);
	}
}
