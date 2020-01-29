package com.GFT.casadeshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GFT.casadeshow.model.User;

public interface Users extends JpaRepository<User, Long> {
	
	

}
