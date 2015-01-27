package com.flexxo.excecoes;

public class ValorInexistenteException extends Exception {
	
	public String getMessage() {
		return "Indice não existente";
	}
}