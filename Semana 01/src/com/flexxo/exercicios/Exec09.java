package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escrever um programa para ler dois valores inteiros.
 * 
 * Valor A e B, efetuar a troca dos valores de modo que a variável A passe e conter o valor de B
 * E vice-versa
 *
 */

public class Exec09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int valorA = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int valorB = scan.nextInt();

		System.out.println("Você digitou: " + valorA + " para a variável 'valorA'");
		System.out.println("Você digitou: " + valorB + " para a variável 'valorB'");

		int valorC = valorA;
		valorA = valorB;
		valorB = valorC;

		System.out.println("Agora 'valorA' é: " + valorA);
		System.out.println("Agora 'valorB' é: " + valorB);

		scan.close();
		System.exit(0);
	}
}