package com.flexxo.vetores;

public class Exemplo04 {

	public static void main(String[] args) {
		String[] frases = new String[5];
		frases[0] = "primeira frase"; 
		frases[1] = frases[0];
		frases[2] = frases[0] + frases[1]; 
		frases[3] = "outro texto qualquer"; 
		frases[4] = "último índice do vetor";
		
		String[] dias = {"segunda", "terça", "quarta", "quinta", "sexta", "sábado", "domingo"};
	}

}
