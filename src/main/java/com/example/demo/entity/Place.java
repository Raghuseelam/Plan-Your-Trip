package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Place {
	@Id
	@GeneratedValue
	int id;
	String name;
	long price;
	String bestTime;

	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Place(String name, long price, String bestTime) {
		super();
		this.name = name;
		this.price = price;
		this.bestTime = bestTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getBestTime() {
		return bestTime;
	}

	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", price=" + price + ", bestTime=" + bestTime + "]";
	}

}
