package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Packagee;

public interface PackageRepo extends JpaRepository<Packagee, Integer>{

	Packagee findByName(String pays);
	Packagee findById(int id);
    

}
