package com.mustafa.moviescollection.service;

import java.util.List;

import com.mustafa.moviescollection.web.dto.UsersDTO;

public interface UsersService {
	public void addUsers(UsersDTO users);
	public void updateUSers(UsersDTO users);
	public void deleteUsers(long id);
	public UsersDTO getUsersByID(long id);
	public List<UsersDTO> getAllUsers();
	
}
