package com.example.demo;

import java.io.Serializable;

public class ContactId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String nameisd;
	public ContactId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactId(String name, String nameisd) {
		super();
		this.name = name;
		this.nameisd = nameisd;
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
	public void setNameisd(String nameisd) {
		this.nameisd = nameisd;
	}
	
	
	
}
