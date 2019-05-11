package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CargoDAO;
import com.example.demo.domain.Cargo;

@Service

public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDAO dao;
	
	@Override
	@Transactional(readOnly = false)
	public void salvar(Cargo cargo) {
		dao.save(cargo);
	}

	@Override
	@Transactional(readOnly = false)
	public void editar(Cargo cargo) {
		dao.update(cargo);
	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean cargoTemFuncionario(Long id) {
		return !dao.findById(id).getFuncionarios().isEmpty();
	}
    
}
