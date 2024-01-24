package com.springBootFirst.Dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.springBootFirst.Model.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	

}
