package com.flexxo.objetos;

public class TesteCarteiraDeEstudante {

	public static void main(String[] args) {
		CarteiraDeEstudante carteira = new CarteiraDeEstudante();
		carteira.nome = "Abelardo Siva";
		carteira.numero = 23435;

		System.out.println("Nome: " + carteira.nome);
		System.out.println("Numero: " + carteira.numero);
	}
}