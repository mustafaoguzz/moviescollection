package com.mustafa.moviescollection.service;

import java.util.List;

import com.mustafa.moviescollection.web.dto.MoviesDTO;

public interface MoviesService {
	public void addMovies(MoviesDTO movies);
	public void updateMovies(MoviesDTO movies);
	public void deleteMovies(long id);
	public MoviesDTO getMoviesByID(long id);
	public List<MoviesDTO> getAllMovies();
	
}
