package com.mustafa.moviescollection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.moviescollection.mapper.UsersMapper;
import com.mustafa.moviescollection.persistence.dao.UsersDAO;
import com.mustafa.moviescollection.service.UsersService;
import com.mustafa.moviescollection.web.dto.UsersDTO;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersDAO usersDAO;

	@Override
	public void addUsers(UsersDTO users) {
		usersDAO.create(UsersMapper.dtoToModel(users));
		
	}

	@Override
	public void updateUSers(UsersDTO users) {
		usersDAO.update(UsersMapper.dtoToModel(users));
		
	}

	@Override
	public void deleteUsers(long id) {
		usersDAO.deleteById(id);
		
	}

	@Override
	public UsersDTO getUsersByID(long id) {
		
		return UsersMapper.modelToDto(usersDAO.findOne(id));
	}

	@Override
	public List<UsersDTO> getAllUsers() {
		
		return UsersMapper.modelToDtoList(usersDAO.findAll());
	}

}
