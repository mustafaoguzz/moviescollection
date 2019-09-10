package com.mustafa.moviescollection.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mov_test")
public class testentity {
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	
	@Column(name = "name")
	private String name;
	
	public testentity() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
