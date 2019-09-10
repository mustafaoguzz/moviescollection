package com.mustafa.moviescollection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.moviescollection.mapper.MovieCastMapper;
import com.mustafa.moviescollection.persistence.dao.MovieCastDAO;
import com.mustafa.moviescollection.service.MovieCastService;
import com.mustafa.moviescollection.web.dto.MovieCastDTO;

@Service
public class MovieCastServiceImpl implements MovieCastService {
	
	@Autowired
	MovieCastDAO movieCastDAO;

	@Override
	public void addMovieCast(MovieCastDTO movieCast) {
		movieCastDAO.create(MovieCastMapper.dtoToModel(movieCast));
		
	}

	@Override
	public void updateMovieCast(MovieCastDTO movieCast) {
		movieCastDAO.update(MovieCastMapper.dtoToModel(movieCast));
		
	}

	@Override
	public void deleteMovieCast(long id) {
		movieCastDAO.deleteById(id);
		
	}

	@Override
	public MovieCastDTO getMovieCastByID(long id) {
		// TODO Auto-generated method stub
		return MovieCastMapper.modelToDto(movieCastDAO.findOne(id));
	}

	@Override
	public List<MovieCastDTO> getAllMovieCast() {
		
		return MovieCastMapper.modelToDtoList(movieCastDAO.findAll());
	}
	

}
