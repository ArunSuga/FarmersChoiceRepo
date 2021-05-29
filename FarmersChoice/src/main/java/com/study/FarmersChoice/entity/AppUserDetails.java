package com.study.FarmersChoice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class AppUserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;

	

	public AppUserDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
 