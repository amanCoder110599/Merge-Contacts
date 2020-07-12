package com.example.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Contact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String nameisd;
	private String name;
	private String phone_numbers;
	public Contact() {
		
	}
	public Contact(String name, String phone_numbers) {
		this.name = name;
		this.phone_numbers = phone_numbers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameisd() {
		return nameisd;
	}
	public void setNameisd(String name_isd) {
		this.nameisd = name_isd;
	}
	public String getPhone_numbers() {
		return phone_numbers;
	}
	public void setPhone_numbers(String phone_numbers) {
		this.phone_numbers = phone_numbers;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name +  ", phone_numbers=" + phone_numbers + "]";
	}
}
