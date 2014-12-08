package com.flexxo.interfaces;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonus();
}