package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.Departamento;

public interface DepartamentoDAO {
	public void save(Departamento entity) ;
	
	public void update(Departamento entity);
	
	public void delete(Long id) ;
	
	public Departamento findById(Long id);
	
	public List<Departamento> findAll();
}
