package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programa para ler um número e informar se o mesmo é:
 * 1. 0 (zero)
 * 2. > 0
 * 3. < 0
 * 
 */

public class Exec05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número [-100, 100]: ");
		int numero = scan.nextInt();

		if (numero == 0) {
			System.out.println("Número digitado é 0");
		} else if (numero > 0) {
			System.out.println("Número digitado é > 0");
		} else {
			System.out.println("Número digitado é < 0");
		}

		scan.close();
		System.exit(0);
	}
}