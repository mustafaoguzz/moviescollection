package com.mustafa.moviescollection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.mustafa.moviescollection.persistence.model.MovieCast;
import com.mustafa.moviescollection.web.dto.MovieCastDTO;

public class MovieCastMapper {
	
	public MovieCastMapper() {
		// TODO Auto-generated constructor stub
	}
	

	public static MovieCastDTO modelToDto(MovieCast model) {
		if (model == null) {
			return null;
		}
		MovieCastDTO dto = new MovieCastDTO();
		dto.setId(model.getId());
		dto.setRole(model.getRole());
		return dto;
	}

	public static MovieCast dtoToModel(MovieCastDTO dto) {
		if (dto == null) {
			return null;
		}
		MovieCast model = new MovieCast();
		model.setId(dto.getId());
		model.setRole(dto.getRole());
		return model;
	}

	public static List<MovieCastDTO> modelToDtoList(List<MovieCast> modelList) {
		if (modelList == null) {
			return null;
		}

		List<MovieCastDTO> dtoList = new ArrayList<MovieCastDTO>();
		for (MovieCast model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<MovieCast> dtoToModelList(List<MovieCastDTO> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<MovieCast> modelList = new ArrayList<MovieCast>();
		for (MovieCastDTO dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}
	

}
