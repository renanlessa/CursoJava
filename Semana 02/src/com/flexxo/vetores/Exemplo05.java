package com.flexxo.vetores;

public class Exemplo05 {

	public static void main(String[] args) {
		// array unidimensional (VETOR)
		String[] frases = new String[5]; 
		// array bidimensional (MATRIZ)
		String[][] tabela = new String[5][15];
		
		// array n-dimensional
		double [][][] densidade;
		
		densidade = new double[10][10][10];
		
		// observe que nem todos os valores de um array
		// precisam estar preenchidos. Sempre que você for 
		// usar o valor contido em uma posição de um array 
		// você deve ter certeza que essa posição
		// foi inicializada
		densidade[0][0][0] = 35.034;
		densidade[1][0][0] = 30.876;
		
		// arrays com mais de três dimensões são raramente
		// encontrados em programas de computador, mas
		// são permitidos em Java
		float[][][][][][] espacoHexaDimensional;
		int[][][][] quartaDimensao = new int[564][2][200][1];
	}
}