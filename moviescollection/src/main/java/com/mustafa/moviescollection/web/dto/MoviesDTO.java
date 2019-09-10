package com.mustafa.moviescollection.web.dto;

import java.io.Serializable;
import java.util.List;

import com.mustafa.moviescollection.persistence.model.MovieCast;

public class MoviesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id; 
	private String name;
	private String year;
	private String lang;
	private String summary;
	private String mediaPath;
	public List<MovieCast> moviesCast;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getMediaPath() {
		return mediaPath;
	}
	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}
	public List<MovieCast> getMoviesCast() {
		return moviesCast;
	}
	public void setMoviesCast(List<MovieCast> moviesCast) {
		this.moviesCast = moviesCast;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
