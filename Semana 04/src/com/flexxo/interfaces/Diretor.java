package com.flexxo.interfaces;

public class Diretor extends Funcionario {
	public double getBonus() {
		return this.salario * 0.30;
	}
	
	public void cobraRelatorios() {
		System.out.println("Preciso dos relatórios já!");
	}
}