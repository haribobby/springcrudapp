package com.emp.springcrudapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 96999442951504799L;
	@Id
	@GeneratedValue
	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
