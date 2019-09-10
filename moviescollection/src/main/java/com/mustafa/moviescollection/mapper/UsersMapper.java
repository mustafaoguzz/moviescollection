package com.mustafa.moviescollection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.mustafa.moviescollection.persistence.model.Users;
import com.mustafa.moviescollection.web.dto.UsersDTO;

public class UsersMapper {
	
	public UsersMapper() {
		// TODO Auto-generated constructor stub
	}

	public static UsersDTO modelToDto(Users model) {
		if (model == null) {
			return null;
		}
		UsersDTO dto = new UsersDTO();
		dto.setId(model.getId());
		dto.setName(model.getName());
		dto.setMail(model.getMail());
		dto.setPassword(model.getPassword());
		dto.setAdmin(model.isAdmin());
		return dto;
	}

	public static Users dtoToModel(UsersDTO dto) {
		if (dto == null) {
			return null;
		}
		Users model = new Users();
		model.setId(dto.getId());
		model.setName(dto.getName());
		model.setMail(dto.getMail());
		model.setPassword(dto.getPassword());
		model.setAdmin(dto.isAdmin());
		return model;
	}

	public static List<UsersDTO> modelToDtoList(List<Users> modelList) {
		if (modelList == null) {
			return null;
		}

		List<UsersDTO> dtoList = new ArrayList<UsersDTO>();
		for (Users model : modelList) {
			dtoList.add(modelToDto(model));
		}
		return dtoList;
	}

	public static List<Users> dtoToModelList(List<UsersDTO> dtoList) {
		if (dtoList == null) {
			return null;
		}
		List<Users> modelList = new ArrayList<Users>();
		for (UsersDTO dto : dtoList) {
			modelList.add(dtoToModel(dto));
		}
		return modelList;
	}

}
