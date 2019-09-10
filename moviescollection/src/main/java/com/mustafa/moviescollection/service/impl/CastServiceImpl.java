package com.mustafa.moviescollection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.moviescollection.mapper.CastMapper;
import com.mustafa.moviescollection.persistence.dao.CastDAO;
import com.mustafa.moviescollection.service.CastService;
import com.mustafa.moviescollection.web.dto.CastDTO;

@Service
public class CastServiceImpl implements CastService {
	
	@Autowired
	CastDAO castDAO;
	
	@Override
	public void addCast(CastDTO cast) {
		castDAO.create(CastMapper.dtoToModel(cast));
		
	}

	@Override
	public void updateCast(CastDTO cast) {
		castDAO.update(CastMapper.dtoToModel(cast));
		
	}

	@Override
	public void deleteCast(long id) {
		 castDAO.deleteById(id); 		
	}

	@Override
	public CastDTO getCastByID(long id) {		
		return CastMapper.modelToDto(castDAO.findOne(id));
	}

	@Override
	public List<CastDTO> getAllCast() {
		return CastMapper.modelToDtoList(castDAO.findAll());
	}
}
