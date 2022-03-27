package com.projetofinal.ProjetoFinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetofinal.ProjetoFinal.dao.ContaDao;
import com.projetofinal.ProjetoFinal.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;

	@GetMapping("/correntistas")

	public ArrayList<Conta> recuperarTudo() {
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>) dao.findAll();
		return lista;
	}
}
