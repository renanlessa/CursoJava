package com.flexxo.sobrecarga;

import java.util.Date;

public class Sobrecarga {
	
	private String nome;
	private String numero;
	private Date data;
	private boolean ativo;
	
	public Sobrecarga() {
	}
	
	public Sobrecarga(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}