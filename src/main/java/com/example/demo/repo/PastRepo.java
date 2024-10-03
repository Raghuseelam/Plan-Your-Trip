package com.example.demo.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PastBookings;

public interface PastRepo extends JpaRepository<PastBookings, Integer> {

	List<PastBookings> findByuserName(String userName);

	List<PastBookings> findByemailId(String emailId);


	

}
