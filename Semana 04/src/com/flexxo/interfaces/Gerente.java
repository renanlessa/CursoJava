package com.flexxo.interfaces;

public class Gerente extends Funcionario {
	public double getBonus() {
		return this.salario * 0.2;
	}
	
	public void cobraEntrega() {
		System.out.println("Está tudo pronto?");
	}
}