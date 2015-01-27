package com.flexxo.objetos.exercicios;

public class TestaPais {
	public static void main(String[] args) {
		Pais paisBrasil = new Pais("BRA", "Brasil", 123123);
		paisBrasil.setPopulacao(123456);
		
		Pais paisBrasil1 = new Pais("BRA", "Brasil", 123123);
		paisBrasil.setPopulacao(123456);
		
		Pais paisBrasil2 = new Pais("BRAA", "Brasil", 123123);
		paisBrasil.setPopulacao(123456);
		
		paisBrasil.imprimePais();
		
		System.out.println(paisBrasil.ehIgual(paisBrasil1));
		System.out.println(paisBrasil.ehIgual(paisBrasil2));
	}
}