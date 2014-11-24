package com.flexxo.exercicios;

import java.util.Scanner;


/*
 *  Escreva um programa de consulta de telefones a partir de um nome informado.
 *  Faça a leitura do nome e telefone, sendo a quantidade determinada pelo usuário
 *  
 *  Exemplo:
 *  
 *  Perguntar para o usuário quantos cadastros ele deseja fazer
 *  E apartir disto perguntar o nome e telefone das pesssoas
 *  
 *  Depois dos nomes e telefones cadastrados, perguntar para o usuário o nome de uma pessoa que ele deseja consultar o número de telefone
 *  E então retornar o número de telefone.
 *  Caso a pessoa não seja encontrada mostrar uma mensagem
 * 
 */

public class Exec09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas pessoas serão cadastradas?");
		int qtdCadastrados = scan.nextInt();

		String[] nomes = new String[qtdCadastrados];
		int[] telefones = new int[qtdCadastrados];

		for (int x = 0; x < qtdCadastrados; x++) {
			System.out.println("Cadastre a pessoa nr " + (x + 1));
			nomes[x] = scan.next();

			System.out.println("Cadastre o telefone da pessoa nr " + (x + 1));
			telefones[x] = scan.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Digite o nome da pessoa a ser consultada: ");
		String nome = scan.next();
		
		boolean inesistente = true;
		for (int x = 0; x < qtdCadastrados; x++) {
			if (nome.equals(nomes[x])) {
				System.out.println("Registro encontrado: ");
				System.out.println("Nome: " + nomes[x]);
				System.out.println("Telefone: " + telefones[x]);
				inesistente = false;
			}
		}

		if (inesistente) {
			System.out.println("Registo não encontrado!");
		}
		
		scan.close();
		System.exit(0);
	}
}