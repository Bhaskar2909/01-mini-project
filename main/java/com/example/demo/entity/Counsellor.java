package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table
public class Counsellor {
	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer Id;
	private String name;
	private String Email;
	private String Password;
	private Long Phno;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Long getPhno() {
		return Phno;
	}
	public void setPhno(Long phno) {
		Phno = phno;
	}
	
	@Override
	public String toString() {
		return "Counsellor [Id=" + Id + ", name=" + name + ", Email=" + Email + ", Password=" + Password + ", Phno="
				+ Phno + "]";
	}
	public String getPwd() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
