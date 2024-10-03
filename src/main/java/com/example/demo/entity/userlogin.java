package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class userlogin {
	@Id
	@GeneratedValue
	int id;
	String userName;
	long phnNum;
	String emailId;
	String password;
	public userlogin()
	{
		super();
	}
	public userlogin(int id,long phnNum, String emailId,String userName,String password)
	{
		this.id=id;
		this.userName=userName;
		this.phnNum=phnNum;
		this.password=password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "userlogin [id=" + id + ", userName=" + userName + ", phnNum=" + phnNum + ", emailId=" + emailId
				+ ", password=" + password + "]";
	}
	
	
}
