package com.flexxo.interfaces;

public class Gerente extends Funcionario implements Autenticavel{
	public double getBonus() {
		return this.salario * 0.2;
	}
	
	public void cobraEntrega() {
		System.out.println("Está tudo pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}