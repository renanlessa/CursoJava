package com.flexxo.heranca;

public class SomaBonificacao {
	
	private double total = 0.0;
	
	public void adiciona(Funcionario f) {
		total += f.getBonus();
	}
	
	public void imprimeTotal() {
		System.out.println("total: " + total);
	}
}