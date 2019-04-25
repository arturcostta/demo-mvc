package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Departamento;

public interface DepartamentoService {
	void salvar(Departamento cargo);
	
	void editar(Departamento cargo);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);
}
