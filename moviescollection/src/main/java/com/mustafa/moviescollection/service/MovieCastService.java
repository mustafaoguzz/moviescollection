package com.mustafa.moviescollection.service;

import java.util.List;

import com.mustafa.moviescollection.web.dto.MovieCastDTO;

public interface MovieCastService {
	public void addMovieCast(MovieCastDTO movieCast);
	public void updateMovieCast(MovieCastDTO movieCast);
	public void deleteMovieCast(long id);
	public MovieCastDTO getMovieCastByID(long id);
	public List<MovieCastDTO> getAllMovieCast();
	
}
