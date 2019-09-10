package com.mustafa.moviescollection.service;

import java.util.List;

import com.mustafa.moviescollection.web.dto.CategoriesDTO;

public interface CategoriesService {
	public void addCast(CategoriesDTO categories);
	public void updateCast(CategoriesDTO categories);
	public void deleteCast(long id);
	public CategoriesDTO getCategoriesByID(long id);
	public List<CategoriesDTO> getAllCategories();
	
}
