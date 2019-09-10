package com.mustafa.moviescollection.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.mustafa.moviescollection.persistence.dao.MoviesDAO;
import com.mustafa.moviescollection.persistence.model.Movies;

@Repository
public class MoviesDAOImpl extends GenericDAOImpl<Movies> implements MoviesDAO {

	public MoviesDAOImpl() {
		setClazz(Movies.class);
	}
 
}
