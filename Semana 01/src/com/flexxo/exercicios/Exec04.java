package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programa para ler 3 notas diferentes de um aluno e informar
 * o valor da sua maior nota.
 * 
 */

public class Exec04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a sua 1ª Nota: ");
		float nota1 = scan.nextFloat();

		System.out.println("Digite a sua 2ª Nota: ");
		float nota2 = scan.nextFloat();

		System.out.println("Digite a sua 3ª Nota: ");
		float nota3 = scan.nextFloat();

		if (nota1 > nota2 && nota1 > nota3) {
			System.out.println("Maior nota: " + nota1);
		} else if (nota2 > nota1 && nota2 > nota3) {
			System.out.println("Maior nota: " + nota2);
		} else {
			System.out.println("Maior nota: " + nota3);
		}

		scan.close();
		System.exit(0);
	}
}