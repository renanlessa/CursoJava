package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programa que leia 2 valores inteiros e imprima o maior deles
 * ou se são iguais
 * 
 */

public class Exec06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número [-100, 100]: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite um número [-100, 100]: ");
		int numero2 = scan.nextInt();

		if (numero1 == numero2) {
			System.out.println("Os valores são iguais!");
		} else if (numero1 > numero2) {
			System.out.println("O primeiro valor é maior que o segundo!");
		} else {
			System.out.println("O segundo valor é maior que o primeiro!");
		}

		scan.close();
		System.exit(0);
	}
}