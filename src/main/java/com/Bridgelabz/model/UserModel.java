package com.Bridgelabz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {
	
@Id
	long id;
	String firstname;
	String lastname;
	int createddate;
	int updatedate;
	char password;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getCreateddate() {
		return createddate;
	}
	public void setCreateddate(int createddate) {
		this.createddate = createddate;
	}
	public int getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(int updatedate) {
		this.updatedate = updatedate;
	}
	public char getPassword() {
		return password;
	}
	public void setPassword(char password) {
		this.password = password;
	}
	public UserModel(long id, String firstname, String lastname, int createddate, int updatedate, char password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.createddate = createddate;
		this.updatedate = updatedate;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", createddate="
				+ createddate + ", updatedate=" + updatedate + ", password=" + password + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
