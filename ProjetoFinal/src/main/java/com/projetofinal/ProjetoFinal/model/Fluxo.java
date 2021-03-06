package com.projetofinal.ProjetoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fluxo_caixa")

public class Fluxo {
	@Id

	private int Ag;

	@Column(name = "Conta")
	private int Conta;

	@Column(name = "Fluxo")
	private int Fluxo;

	@Column(name = "Entrada")
	private double Entrada;

	@Column(name = "Saida")
	private double Saida;

	public int getAg() {
		return Ag;
	}

	public void setAg(int ag) {
		Ag = ag;
	}

	public int getConta() {
		return Conta;
	}

	public void setConta(int conta) {
		Conta = conta;
	}

	public int getFluxo() {
		return Fluxo;
	}

	public void setFluxo(int fluxo) {
		Fluxo = fluxo;
	}

	public double getEntrada() {
		return Entrada;
	}

	public void setEntrada(double entrada) {
		Entrada = entrada;
	}

	public double getSaida() {
		return Saida;
	}

	public void setSaida(double saida) {
		Saida = saida;
	}

}
