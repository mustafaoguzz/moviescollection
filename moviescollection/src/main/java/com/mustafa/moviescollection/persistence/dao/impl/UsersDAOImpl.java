package com.mustafa.moviescollection.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.mustafa.moviescollection.persistence.dao.UsersDAO;
import com.mustafa.moviescollection.persistence.model.Users;

@Repository
public class UsersDAOImpl extends GenericDAOImpl<Users> implements UsersDAO {

	public UsersDAOImpl() {
		setClazz(Users.class);
	}
}


