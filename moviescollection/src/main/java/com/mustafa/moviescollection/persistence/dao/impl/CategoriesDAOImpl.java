package com.mustafa.moviescollection.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.mustafa.moviescollection.persistence.dao.CategoriesDAO;
import com.mustafa.moviescollection.persistence.model.Categories;

@Repository
public class CategoriesDAOImpl extends GenericDAOImpl<Categories> implements CategoriesDAO {

	public CategoriesDAOImpl() {
		setClazz(Categories.class);
	}
 
}
