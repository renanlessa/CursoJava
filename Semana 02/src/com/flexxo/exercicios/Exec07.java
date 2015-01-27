package com.flexxo.exercicios;

import java.util.Scanner;

/*
 * Escreva um programa para ler 5 nomes e notas de uma turma.
 * Grave os nomes em um array e as notas em outro.
 * 
 * Calcule e exiba a média das notas da turma e em seguida
 * exiba os nomes cuja as notas form superiores a média
 * 
 */

public class Exec07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        String[] nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media;
        
        for (int i = 0 ; i <= 4 ; i++){
            
        	System.out.println("Entre com o nome do aluno nº "+(i+1));
            nomes[i] = scan.next();
            
            System.out.println("Entre com a nota do aluno nº "+(i+1));
            notas[i] = scan.nextDouble();
            
            soma = soma + notas[i];
        }
        
        media = soma / 5;
        
        System.out.println("A média dos alunos é: "+ media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota é superior a média da turma: ");
        for(int i = 0; i <= 4; i++) {
            if(notas[i] > media)
                System.out.println(nomes[i]);    
        }
        
        scan.close();
        System.exit(0);
	}
}