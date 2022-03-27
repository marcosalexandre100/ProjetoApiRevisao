package com.projetofinal.ProjetoFinal.dao;

import org.springframework.data.repository.CrudRepository;

import com.projetofinal.ProjetoFinal.model.Conta;

public interface ContaDao extends CrudRepository<Conta,Integer> {
	  
}
