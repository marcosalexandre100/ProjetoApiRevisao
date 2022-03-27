package com.projetofinal.ProjetoFinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetofinal.ProjetoFinal.dao.FluxoDao;
import com.projetofinal.ProjetoFinal.model.Fluxo;

@RestController
public class FluxoController {
	@Autowired
	private FluxoDao dao;

	@RequestMapping("/fluxo_caixa")

	public ArrayList<Fluxo> recuperarTudo() {
		ArrayList<Fluxo> lista;
		lista = (ArrayList<Fluxo>) dao.findAll();

		return lista;
	}

}