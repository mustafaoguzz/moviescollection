package com.mustafa.moviescollection.service;

import java.util.List;

import com.mustafa.moviescollection.web.dto.CastDTO;

public interface CastService {
	public void addCast(CastDTO cast);
	public void updateCast(CastDTO cast);
	public void deleteCast(long id);
	public CastDTO getCastByID(long id);
	public List<CastDTO> getAllCast();
	
}
