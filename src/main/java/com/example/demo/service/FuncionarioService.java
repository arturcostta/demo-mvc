package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario cargo);

	void editar(Funcionario cargo);

	void excluir(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	Object buscarPorCargo(Long id);
}
