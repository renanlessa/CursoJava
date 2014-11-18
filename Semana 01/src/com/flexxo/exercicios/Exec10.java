package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programa que leia um valor inteiro e imprima se o valor é:
 * 1. Zero
 * 2. Valor Par
 * 3. Valor Impar 
 *
 */

public class Exec10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int numero = scan.nextInt();

		if (numero == 0) {
			System.out.println("Número zero!");
		} else if (numero % 2 == 0) {
			System.out.println("Número Par!");
		} else {
			System.out.println("Número Impar!");
		}

		scan.close();
		System.exit(0);
	}
}