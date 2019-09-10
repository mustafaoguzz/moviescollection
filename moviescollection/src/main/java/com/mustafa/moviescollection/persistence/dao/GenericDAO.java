package com.mustafa.moviescollection.persistence.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	public T findOne(long id);
	
	public List<T> findAll();

	public void create(T entity);

	public T update(T entity);

	public void delete(T entity);

	public void deleteById(long id);

	public int getRowCount();
}