package com.flexxo.ramificacoes;

public class IfElse03 {

	public static void main(String[] args) {
		int x = 10;
		
		if (x > 11) {
			System.out.println("X > 11");
		} else {
			if (x > 10) {
				System.out.println("X > 10");
			} else {
				if (x > 9) {
					System.out.println("X > 9");
				} else {
					System.out.println("X <= 9");
				}
			}
		}
	}
}
