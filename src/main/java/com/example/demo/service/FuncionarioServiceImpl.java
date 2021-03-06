package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.FuncionarioDAO;
import com.example.demo.domain.Funcionario;

@Service

public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	FuncionarioDAO dao;
	
	@Override
	@Transactional(readOnly = false)
	public void salvar(Funcionario entity) {
		dao.save(entity);
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Funcionario entity) {
		dao.update(entity);
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public List<Funcionario> buscarPorNome(String nome) {
		return dao.findByNome(nome);
	}

	@Override
	public Object buscarPorCargo(Long id) {
		return dao.findByCargo(id);
	}

	@Override
	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
		if(entrada != null && saida != null) {
			return dao.findByDataEntradaSaida(entrada,saida);
		}else if(entrada != null) {
			return dao.findByDataEntrada(entrada);
		}else if(saida != null) {
			return dao.findByDataSaida(saida);
		}else {
			return new ArrayList<>();
		}
		
	}

}
