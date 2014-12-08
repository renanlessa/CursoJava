package com.flexxo.excecoes;

public class Sistema {
	
	private String[] valores = new String[50];
	
	public void relatorio(int indice) {
		System.out.println(valores[indice]);
	}
	
	public static void main(String[] args) {
		Sistema s = new Sistema();
		s.relatorio(51);
	}
}