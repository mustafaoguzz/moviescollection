package com.mustafa.moviescollection.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.mustafa.moviescollection.persistence.dao.CastDAO;
import com.mustafa.moviescollection.persistence.model.Cast;

@Repository
public class CastDAOImpl extends GenericDAOImpl<Cast> implements CastDAO {

	public CastDAOImpl() {
		setClazz(Cast.class);
	}
 
}
