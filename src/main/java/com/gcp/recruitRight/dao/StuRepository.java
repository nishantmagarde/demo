package com.gcp.recruitRight.dao;

import org.springframework.data.repository.CrudRepository;

import com.gcp.recruitRight.entities.User;

public interface StuRepository extends CrudRepository<User, Integer> {
	
}
