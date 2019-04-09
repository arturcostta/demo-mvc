package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Funcionario;

@Repository
public class FuncionarioDAOImpl extends AbstractDAO<Funcionario, Long> implements FuncionarioDAO {

}
