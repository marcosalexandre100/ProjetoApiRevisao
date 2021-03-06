package com.projetofinal.ProjetoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "correntistas")

public class Conta {
	@Id

	private int Ag;

	@Column(name = "Conta")
	private int Conta;

	@Column(name = "nome")
	private String nome;

	@Column(name = "Email")
	private String Email;

	@Column(name = "Telefone")
	private String Telefone;

	@Column(name = "Saldo")
	private double Saldo;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
