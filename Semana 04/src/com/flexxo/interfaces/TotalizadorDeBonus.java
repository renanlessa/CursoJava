package com.flexxo.interfaces;

public class TotalizadorDeBonus {
	
	private double total = 0;
	
	public void somaBonus(Funcionario f) {
		total += f.getBonus();
	}
	
	public double getTotalBonus() {
		return this.total;
	}
}