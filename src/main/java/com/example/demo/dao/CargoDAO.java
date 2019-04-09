package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.Cargo;

public interface CargoDAO {
	public void save(Cargo entity) ;
	
	public void update(Cargo entity);
	
	public void delete(Long id) ;
	
	public Cargo findById(Long id);
	
	public List<Cargo> findAll();
}
