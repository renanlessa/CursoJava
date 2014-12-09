package com.flexxo.interfaces;

public class SistemaInterno {
	
	private int senha = 123;
	
	public void autentica(Autenticavel a) {
		if (a.autentica(senha) == true) {
			System.out.println("Senha Correta! Acesso Permitido!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}	
}