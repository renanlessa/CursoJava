package com.flexxo.interfaces;

public class Cliente implements Autenticavel {
	public String nome;
	public String endereco;
	
	@Override
	public boolean autentica(int senha) {
		//regra de autenticacao do cliente
		return false;
	}
}
