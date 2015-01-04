package com.flexxo.exercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Baseado no arquivo chamado estoque.txt presente neste projeto.
 * 
 * O arquivo representa o estoque da loja, ex:
 * 1,Camiseta,79.90
 * 
 * O numero 1 indica o codigo do produto, 
 * o nome "Camiseta" indica o nome do produto,
 * e o ultimo valor indica o preço
 * 
 *  O arquivo estoque.txt conta com 4 codigos de produtos, ler o arquivo
 *  e retornar o valor total por codigo de produto.
 * 
 */

public class TesteExec01 {
	public static void main(String[] args) {
	
		Scanner scan = null;
		String[] produto = new String[3];
		String linha = null;
		try {
			scan = new Scanner(new FileInputStream("estoque.txt"));
			while(scan.hasNextLine()) {
				produto = scan.nextLine().split(",");
				
				System.out.println(produto[0]);
				System.out.println(produto[1]);
				System.out.println(produto[2]);
				
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
		
		
	}
}