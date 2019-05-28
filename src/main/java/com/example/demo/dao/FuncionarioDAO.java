package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.Funcionario;

public interface FuncionarioDAO {
	public void save(Funcionario entity);

	public void update(Funcionario entity);

	public void delete(Long id);

	public Funcionario findById(Long id);

	public List<Funcionario> findAll();

	public List<Funcionario> findByNome(String nome);

	public List<Funcionario> findByCargo(Long id);
}
