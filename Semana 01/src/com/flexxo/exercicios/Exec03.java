package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programa para ler 3 notas de um aluno e informar se 
 * o alunos está aprovado, reprovado ou se deverá fazer a prova
 * final.
 *
 * 1. O aluno será Aprovado se a média de suas notas for >= 6
 * 2. O aluno será Reprovado se a média de suas notas for < 4
 * 3. O aluno deverá fazer exame se a média de suas notas for >= 4 e < 6 
 *
 * Média das notas: (Nota1 + Nota2 + Nota3) / 3
 * 
 */

public class Exec03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua 1ª Nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite a sua 2ª Nota: ");
		float nota2 = scan.nextFloat();
		
		System.out.println("Digite a sua 3ª Nota: ");
		float nota3 = scan.nextFloat();

		float resultado = (nota1 + nota2 + nota3) / 3;
		
		if( resultado >= 6) {
			System.out.println("Parabens! Você foi aprovado!");
		} else if ( resultado < 4 ) {
			System.out.println("Oops! Você foi reprovado!");
		} else {
			System.out.println("Prepare-se! Você esta em exame!");
		}
		
		scan.close();
		System.exit(0);
	}
}