package com.flexxo.operadores;

public class Igualdade {

	public static void main(String[] args) {
		
		// IGUALDADE DE TIPOS PRIMITIVOS
		
		System.out.println("Char 'a' == 'a'? " + ('a' == 'a'));
		
		System.out.println("Char 'a' == 'b'? " + ('a' == 'b'));
		
		System.out.println("5 != 6 ? " + (5 != 6));
		
		System.out.println("5.0 != 5L ? " + (5.0 != 5L));
		
		System.out.println("true == false ? " + (true == false));
		
		// IGUALDADE DE VARIAVEIS DE REFERENCIA

		String a = new String("Flexxo");
		String b = "Flexxo";

		System.out.println(" a == b ? " + (a == b));
		System.out.println(" a == b ? " + (a.equals(b)));
		
		

	}

}
