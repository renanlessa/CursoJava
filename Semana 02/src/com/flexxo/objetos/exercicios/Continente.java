package com.flexxo.objetos.exercicios;

/*
 * Escreva em Java uma classe Continente. 
 * Um continente possui um nome e é composto por um conjunto de países. 
 * Forneça os membros de classe a seguir:
 * 
 * a) Construtor que inicialize o nome do continente; 
 * b) Um método que permita adicionar países aos continentes;
 * c) Um método que retorne a dimensão total do continente;
 * d) Um método que retorne a população total do continente;
 * f) Um método que retorne o país com maior população no continente;
 * g) Um método que retorne o país com menor população no continente;
 * h) Um método que retorne o país de maior dimensão territorial no 
 * continente;
 * i) Um método que retorne o país de menor dimensão territorial no 
 * continente;
 * 
 */

public class Continente {
	private String nome;
	private Pais[] paises;
	
	public Continente(String nome, int numeroPaises) {
		this.nome = nome;
		paises = new Pais[numeroPaises];
	}
	
	public void addPais(int posicao, Pais pais) {
		if (posicao >= 0 && posicao < paises.length) {
			paises[posicao] = pais;
		} else {
			System.out.println("Posição invalida!");
		}
	
	}
	
	public float retornaDimensaoTotal() {
		float total = 0F;
		for (Pais pais : paises) {
			if(pais != null)
				total += pais.getDimensao();
		}
		return total;
	}
	
	public float retornaPopulacaoTotal() {
		float total = 0F;
		for (Pais pais : paises) {
			if(pais != null)
				total += pais.getPopulacao();
		}
		return total;
	}
	
	public String retornaPaisComMaiorPopulacao() {
		float maior = 0;
		String nomePais = "";
		for (Pais pais : paises) {
			if(pais != null) {
				if (pais.getPopulacao() > maior) {
					maior = pais.getPopulacao();
					nomePais = pais.getNome();
				}
			}
		}
		return nomePais;
	}
	
	public String retornaPaisComMaiorDimensao() {
		float maior = 0;
		String nomePais = "";
		for (Pais pais : paises) {
			if(pais != null) {
				if (pais.getDimensao() > maior) {
					maior = pais.getDimensao();
					nomePais = pais.getNome();
				}
			}
		}
		return nomePais;
	}
	
	/*
	 * gets e sets 
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais[] getPaises() {
		return paises;
	}

	public void setPaises(Pais[] paises) {
		this.paises = paises;
	}
}