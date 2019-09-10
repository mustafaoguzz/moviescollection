package com.mustafa.moviescollection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mustafa.moviescollection.mapper.CategoriesMapper;
import com.mustafa.moviescollection.persistence.dao.CategoriesDAO;
import com.mustafa.moviescollection.service.CategoriesService;
import com.mustafa.moviescollection.web.dto.CategoriesDTO;

@Service
public class CategoriesServiceImpl implements CategoriesService  {
	
	@Autowired
	CategoriesDAO categoriesDAO;

	@Override
	public void addCast(CategoriesDTO categories) {
		categoriesDAO.create(CategoriesMapper.dtoToModel(categories));
		
	}

	@Override
	public void updateCast(CategoriesDTO categories) {
		categoriesDAO.create(CategoriesMapper.dtoToModel(categories));
		
	}

	@Override
	public void deleteCast(long id) {
		categoriesDAO.deleteById(id); 
	}

	@Override
	public CategoriesDTO getCategoriesByID(long id) {
		
		return CategoriesMapper.modelToDto(categoriesDAO.findOne(id));
	}

	@Override
	public List<CategoriesDTO> getAllCategories() {
		
		return CategoriesMapper.modelToDtoList(categoriesDAO.findAll());
	}

}
