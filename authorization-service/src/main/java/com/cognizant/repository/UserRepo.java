package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.MyUser;

@Repository
public interface UserRepo extends JpaRepository<MyUser, Integer> {

	public MyUser findByUserName(String name);
}
