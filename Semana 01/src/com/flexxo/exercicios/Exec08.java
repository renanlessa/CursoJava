package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreve um programa para calcular o IMC de uma pessoa.
 * O programa deve ler dois valores:
 * 
 * 1. peso
 * 2. altura
 * 
 * Calculo = peso / (altura * altura)
 */

public class Exec08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu peso: ");
		float peso = scan.nextFloat();

		System.out.println("Digite sua altura: ");
		float altura = scan.nextFloat();

		float imc = peso / (altura * altura);

		System.out.println("Seu IMC é: " + imc);

		scan.close();
		System.exit(0);
	}
}