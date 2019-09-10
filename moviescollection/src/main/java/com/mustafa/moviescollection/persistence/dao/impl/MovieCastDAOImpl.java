package com.mustafa.moviescollection.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.mustafa.moviescollection.persistence.dao.MovieCastDAO;
import com.mustafa.moviescollection.persistence.model.MovieCast;

@Repository
public class MovieCastDAOImpl extends GenericDAOImpl<MovieCast> implements MovieCastDAO {

	public MovieCastDAOImpl() {
		setClazz(MovieCast.class);
	}
 
}
