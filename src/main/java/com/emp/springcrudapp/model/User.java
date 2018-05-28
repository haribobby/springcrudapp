package com.emp.springcrudapp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1015508331389438258L;

	@Id
	@GeneratedValue
	private Long id;

	@Size(min=3, max=7)
	@NotNull
	private String name;
	@NotNull(message="Address Should not be empty")
	private String address;
	@NotNull(message="Mobile number Should not be empty")
	private String mobileNumber;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Post> posts;

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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", posts=" + posts + "]";
	}

}
