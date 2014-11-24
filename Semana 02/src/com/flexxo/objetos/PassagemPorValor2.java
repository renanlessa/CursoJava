package com.flexxo.objetos;

public class PassagemPorValor2 {
	public static void main(String[] args) {
		CarteiraDeEstudante carteira = new CarteiraDeEstudante();
		carteira.nome = "Flexxo";
		carteira.numero = 34534;
		
		concatenaNome(carteira);
		
		System.out.println("Nome: " + carteira.nome);
		System.out.println("Numero: " + carteira.numero);
	}
	
	public static void concatenaNome(CarteiraDeEstudante c) {
		c.nome += " Pelotas";
	}
}
