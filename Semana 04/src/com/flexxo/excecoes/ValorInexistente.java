package com.flexxo.excecoes;

public class ValorInexistente extends Exception {
	
	public String getMessage() {
		return "Indice não existente";
	}
}