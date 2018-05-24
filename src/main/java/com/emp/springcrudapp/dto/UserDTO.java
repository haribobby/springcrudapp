package com.emp.springcrudapp.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1697361834761034606L;

	private Long id;
	private String name;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
