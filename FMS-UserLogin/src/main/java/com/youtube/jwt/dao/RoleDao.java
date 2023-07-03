package com.youtube.jwt.dao;

import com.youtube.jwt.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
*
*
* @author Sahil Burade
*/
@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
