package com.flexxo.objetos;

public class PassagemPorValor {
	public static void main(String[] args) {
		int valor = 2; 
		
		somaDez(valor);
		
		System.out.println("valor = " + valor);
	}
	
	public static void somaDez(int valor) {
		valor += 10;
	}
}