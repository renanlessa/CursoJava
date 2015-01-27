package com.flexxo.heranca;

public abstract class Funcionario {
	
	protected String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void getInfo() {
		System.out.println("Ola eu sou " + this.nome + "e eu ganho R$" + this.salario);
	}
	
	public final void teste() {
		System.out.println("OI");
	}
	
	public abstract double getBonus();
}