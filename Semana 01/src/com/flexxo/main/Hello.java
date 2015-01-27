package com.flexxo.main;

import java.util.Scanner;

// Classe Hello
public class Hello {
	
	// Variavel de instância
	public String mensagem = "Hello World!";
	
	//Método da classe
	public static void imprimeMsg(String mensagem) {
		System.out.println(mensagem);
	}
	
	//Método estático main
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite sua mensagem: ");
	    String mensagem = s.nextLine();
	    imprimeMsg(mensagem);
	}
}