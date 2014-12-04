package com.flexxo.heranca;

public class Gerente extends Funcionario {
	
	private String senha;
	
	public double getBonus() {
		return this.salario * 0.2;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("Minha senha é " + this.senha);
	}
}