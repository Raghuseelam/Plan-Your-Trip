package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	int id;
	String userName;
	long phnNum;
	String emailId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, long phnNum, String emailId) {
		super();
		this.id = id;
		this.userName = userName;
		this.phnNum = phnNum;
		this.emailId = emailId;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", phnNum=" + phnNum + ", emailId=" + emailId + "]";
	}

}
