package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Packagee {
	@Id
	@GeneratedValue()
	int id;
	String name;
	String days;
	String price;
	String inclusion;

	public Packagee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Packagee(int id, String name, String days, String price, String inclusion) {
		super();
		this.id = id;
		this.name = name;
		this.days = days;
		this.price = price;
		this.inclusion = inclusion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getInclusion() {
		return inclusion;
	}

	public void setInclusion(String inclusion) {
		this.inclusion = inclusion;
	}

	@Override
	public String toString() {
		return "Package [id=" + id + ", name=" + name + ", days=" + days + ", price=" + price + ", inclusion="
				+ inclusion + "]";
	}

}
