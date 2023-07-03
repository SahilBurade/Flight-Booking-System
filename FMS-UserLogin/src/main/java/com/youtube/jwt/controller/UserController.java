package com.youtube.jwt.controller;


import com.youtube.jwt.entity.User;
import com.youtube.jwt.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
/**
*
*
* @author Sahil Burade
*/
@RestController
public class UserController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
	
	/**
	 * Initialized the logger object
	 */
	private static Logger log = Logger.getLogger(UserController.class);
	/**
	 * UserService autowired
	 */
    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    /**
	 * Method to register new user
	 */
    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
    	log.info("New user is registered successfully");
        return userService.registerNewUser(user);
    }

    /**
   	 * Test Method to check authorization of admin
   	 */
    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }
    /**
   	 * Test Method to check authorization of user
   	 */
    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }
}
