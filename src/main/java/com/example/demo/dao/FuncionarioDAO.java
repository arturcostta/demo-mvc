package com.example.demo.dao;

import java.time.LocalDate;
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

	public List<Funcionario> findByDataEntradaSaida(LocalDate entrada, LocalDate saida);

	public List<Funcionario> findByDataEntrada(LocalDate entrada);

	public List<Funcionario> findByDataSaida(LocalDate saida);
}
