package com.mustafa.moviescollection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.moviescollection.mapper.MoviesMapper;
import com.mustafa.moviescollection.persistence.dao.MoviesDAO;
import com.mustafa.moviescollection.service.MoviesService;
import com.mustafa.moviescollection.web.dto.MoviesDTO;

@Service
public class MoviesServiceImpl implements MoviesService {
	
	@Autowired
	MoviesDAO moviesDAO;

	@Override
	public void addMovies(MoviesDTO movies) {
		moviesDAO.create(MoviesMapper.dtoToModel(movies));
		
	}

	@Override
	public void updateMovies(MoviesDTO movies) {
		moviesDAO.update(MoviesMapper.dtoToModel(movies));
		
	}

	@Override
	public void deleteMovies(long id) {
		moviesDAO.deleteById(id);
		
	}

	@Override
	public MoviesDTO getMoviesByID(long id) {
		
		return MoviesMapper.modelToDto(moviesDAO.findOne(id));
	}

	@Override
	public List<MoviesDTO> getAllMovies() {
		
		return MoviesMapper.modelToDtoList(moviesDAO.findAll());
	}

}
