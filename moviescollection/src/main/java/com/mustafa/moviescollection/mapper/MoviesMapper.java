package com.mustafa.moviescollection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.mustafa.moviescollection.persistence.model.Movies;
import com.mustafa.moviescollection.web.dto.MoviesDTO;

public class MoviesMapper {
	
	public MoviesMapper() {
		// TODO Auto-generated constructor stub
	}

	public static MoviesDTO modelToDto(Movies model) {
		if (model == null) {
			return null;
		}
		MoviesDTO dto = new MoviesDTO();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setYear(model.getYear());
		dto.setLang(model.getLang());
		return dto;
	}

	public static Movies dtoToModel(MoviesDTO dto) {
		if (dto == null) {
			return null;
		}
		Movies model = new Movies();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setYear(dto.getYear());
		model.setLang(dto.getLang());
		return model;
	}


	public static List<MoviesDTO> modelToDtoList(List<Movies> modelList) {
		if (modelList == null) {
			return null;
		}

		List<MoviesDTO> dtoList = new ArrayList<MoviesDTO>();
		for (Movies model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Movies> dtoToModelList(List<MoviesDTO> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Movies> modelList = new ArrayList<Movies>();
		for (MoviesDTO dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}

}
