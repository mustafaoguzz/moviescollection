package com.mustafa.moviescollection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.mustafa.moviescollection.persistence.model.Categories;
import com.mustafa.moviescollection.web.dto.CategoriesDTO;

public class CategoriesMapper {
	
	public CategoriesMapper() {
		// TODO Auto-generated constructor stub
	}
	

	public static CategoriesDTO modelToDto(Categories model) {
		if (model == null) {
			return null;
		}
		CategoriesDTO dto = new CategoriesDTO();
		dto.setId(model.getId());
		dto.setName(model.getName());
		return dto;
	}

	public static Categories dtoToModel(CategoriesDTO dto) {
		if (dto == null) {
			return null;
		}
		Categories model = new Categories();
		model.setId(dto.getId());
		model.setName(dto.getName());
		return model;
	}

	public static List<CategoriesDTO> modelToDtoList(List<Categories> modelList) {
		if (modelList == null) {
			return null;
		}

		List<CategoriesDTO> dtoList = new ArrayList<CategoriesDTO>();
		for (Categories model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Categories> dtoToModelList(List<CategoriesDTO> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Categories> modelList = new ArrayList<Categories>();
		for (CategoriesDTO dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}

}
