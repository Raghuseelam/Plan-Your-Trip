package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repo.PackageRepo;

@SuppressWarnings("unused")
@Entity
public class PastBookings {
	@Id
	@GeneratedValue
	int id;
	String userName;
	long phnNum;
	String emailId;
	String packagename;
	String days;
	String price;
	String inclusion;

	public PastBookings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PastBookings(int id, String userName, long phnNum, String emailId, String packagename, String days,
			String price, String inclusion) {
		super();
		this.id = id;
		this.userName = userName;
		this.phnNum = phnNum;
		this.emailId = emailId;
		this.packagename = packagename;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhnNum() {
		return phnNum;
	}

	public void setPhnNum(long phnNum) {
		this.phnNum = phnNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
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
		return "PastBookings [id=" + id + ", userName=" + userName + ", phnNum=" + phnNum + ", emailId=" + emailId
				+ ", packagename=" + packagename + ", days=" + days + ", price=" + price + ", inclusion=" + inclusion
				+ "]";
	}

}
