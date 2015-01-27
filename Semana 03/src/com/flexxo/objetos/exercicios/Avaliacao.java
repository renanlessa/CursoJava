package com.flexxo.objetos.exercicios;

public class Avaliacao {
	private float[] trabalhos = new float[4];
	private float[] provas = new float[2];
	
	public void adicionaTrabalho(int posicao, float nota) {
		if(posicao >= 0 && posicao < trabalhos.length) {
			if(nota >= 0 && nota <= 10) {
				trabalhos[posicao] = nota;
			} else {
				System.out.println("Nota invalida!");
			}
		} else {
			System.out.println("Posição invalida!");
		}
	}
	
	public void adicionaProva(int posicao, float nota) {
		if(posicao >= 0 && posicao < provas.length) {
			if(nota >= 0 && nota <= 10) {
				provas[posicao] = nota;
			} else {
				System.out.println("Nota inválida!");
			}
		} else {
			System.out.println("Posição inválida!");
		}
	}
	
}