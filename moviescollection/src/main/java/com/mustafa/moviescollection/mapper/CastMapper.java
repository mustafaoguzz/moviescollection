package com.mustafa.moviescollection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.mustafa.moviescollection.persistence.model.Cast;
import com.mustafa.moviescollection.web.dto.CastDTO;

public class CastMapper {
	
	public CastMapper() {
		// TODO Auto-generated constructor stub
	}
	

	public static CastDTO modelToDto(Cast model) {
		if (model == null) {
			return null;
		}
		CastDTO dto = new CastDTO();
		dto.setId(model.getId());
		dto.setName(model.getName());
		return dto;
	}

	public static Cast dtoToModel(CastDTO dto) {
		if (dto == null) {
			return null;
		}
		Cast model = new Cast();
		model.setId(dto.getId());
		model.setName(dto.getName());
		return model;
	}

	public static List<CastDTO> modelToDtoList(List<Cast> modelList) {
		if (modelList == null) {
			return null;
		}

		List<CastDTO> dtoList = new ArrayList<CastDTO>();
		for (Cast model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Cast> dtoToModelList(List<CastDTO> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Cast> modelList = new ArrayList<Cast>();
		for (CastDTO dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}

}
