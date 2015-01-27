package com.flexxo.interfaces;

public class Diretor extends Funcionario implements Autenticavel {
	public double getBonus() {
		return this.salario * 0.30;
	}
	
	public void cobraRelatorios() {
		System.out.println("Preciso dos relatórios já!");
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}