package com.flexxo.objetos.exercicios;

public class TestaContinente {
	public static void main(String[] args) {
		Continente americaSul = new Continente("America do Sul", 3);
		
		Pais brasil = new Pais("BRA", "Brasil", 1234);
		brasil.setPopulacao(200000);
		Pais uruguai = new Pais("UY", "Uruguai", 12);
		uruguai.setPopulacao(100000);
		Pais argentina = new Pais("AR", "Argentina", 123);
		argentina.setPopulacao(150000);
		
		americaSul.addPais(0, brasil);
		americaSul.addPais(1, uruguai);
		americaSul.addPais(2, argentina);
		
		System.out.println("Dimensao Total: " + americaSul.retornaDimensaoTotal());
		System.out.println("Populacao Total: " + americaSul.retornaPopulacaoTotal());
	}
}