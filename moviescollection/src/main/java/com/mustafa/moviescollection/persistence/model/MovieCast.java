package com.mustafa.moviescollection.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Mov_Movie_Cast")

public class MovieCast {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id; 
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Movies movie; 
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "id")
	private Cast cast;
	
	private String role;
	
	
	public MovieCast() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Movies getMovie() {
		return movie;
	}


	public void setMovie(Movies movie) {
		this.movie = movie;
	}


	public Cast getCast() {
		return cast;
	}


	public void setCast(Cast cast) {
		this.cast = cast;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	

}
