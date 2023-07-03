package com.youtube.jwt.dao;

import com.youtube.jwt.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
*
*
* @author Sahil Burade
*/
@Repository
public interface UserDao extends CrudRepository<User, String> {
}
