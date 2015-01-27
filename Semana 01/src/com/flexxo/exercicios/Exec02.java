package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programada para efetuar o cáculo do salário bruto de um empregado.
 * Pedir para que o usuário entre com os seguintes dados:
 * 
 *  1. O valor do salário hora;
 *  2. Número de horas trabalhadas no mês
 * 
 */

public class Exec02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu valor hora: ");
		float valorHora = scan.nextFloat();

		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int qtdHoras = scan.nextInt();

		float resultado = valorHora * qtdHoras;

		System.out.println("Resultado: " + resultado);

		scan.close();
		System.exit(0);
	}
}