package com.youtube.jwt.controller;

import com.youtube.jwt.entity.Role;
import com.youtube.jwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
*
*
* @author Sahil Burade
*/
@RestController
public class RoleController {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
	
	
	/**
	 * RoleService autowired
	 */
    @Autowired
    private RoleService roleService;

    /**
	 * Method to create new user
	 */
    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
}
