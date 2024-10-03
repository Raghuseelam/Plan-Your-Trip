package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Place;

public interface PlaceRepo extends JpaRepository<Place, Integer> {

	Place findByName(String places);
}
