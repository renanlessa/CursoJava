package com.flexxo.heranca.exercicios;

public class EmpregadoDaFaculdade {
	
	private String nome;
	private double salario;

	public double getGastos() {
		return this.salario;
	}
	
	public String getInfo() {
		return "Meu nome é " + this.nome + " e meu salario é: R$" + this.salario;
	}
	
	/*
	 * getters e setters
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}