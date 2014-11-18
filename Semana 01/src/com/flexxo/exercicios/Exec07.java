package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Crie uma calculadora utilizando switch
 * O programa deverá ler 3 valores: dois números e um caractere
 * O caractere poderá ser '+', '-', '*' ou  '/'
 * De acordo com o caractere realize a operação entre os dois números
 * 
 */

public class Exec07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Olá, eu sou uma calculadora.");
		System.out
				.println("Por favor digite o caractere correspondente a sua operação na Calculadora:");
		System.out.println("         Soma: + ");
		System.out.println("    Subtração: - ");
		System.out.println("      Divisão: / ");
		System.out.println("Multiplicação: * ");

		char operacao = scan.next().charAt(0);

		System.out
				.println("Por favor agora digite os dois valores para sua operação.");

		System.out.println("1º Valor:");
		float valor1 = scan.nextFloat();

		System.out.println("2º Valor:");
		float valor2 = scan.nextFloat();

		switch (operacao) {
			case '+':
				System.out.println("Valor da soma: " + (valor1 + valor2));
				break;
			case '-':
				System.out.println("Valor da subtração: " + (valor1 - valor2));
				break;
			case '*':
				System.out.println("Valor da multiplicação: " + (valor1 * valor2));
				break;
			case '/':
				System.out.println("Valor da divisão: " + (valor1 / valor2));
				break;
			default:
				System.out.println("Operação Inválida!");
				break;
		}

		scan.close();
		System.exit(0);
	}
}
