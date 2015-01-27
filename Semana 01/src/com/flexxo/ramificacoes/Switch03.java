package com.flexxo.ramificacoes;

public class Switch03 {
	public static void main(String[] args) {
		char x = 'a';

		switch (x) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				System.out.println("B");
				break;
			default:
				System.out.println("default");
				System.out.println("default");
				break;
		}
	}
}