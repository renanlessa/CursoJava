package com.flexxo.exercicios;

public class Exec10 {
	public static void main(String[] args) {
		int[][] m = new int[10][10];

		System.out.println("Sorteando números...");

		for (int n = 0; n < 10; n++) {
			for (int i = 0; i < 10; i++) {
				m[n][i] = (int) (Math.random() * 9) + 1;
			}
		}
		System.out.println("Matriz preenchida!");
		System.out.println("Conteúdo de cada posição da matriz:");
		for (int n = 0; n < 10; n++) {
			for (int i = 0; i < 10; i++) {
				System.out.println("m[" + n + "][" + i + "] = " + m[n][i]);
			}
		}
		System.out.println("Conteúdo da matriz completa:");
		for (int n = 0; n < 10; n++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(m[n][i] + " ");
			}
			System.out.println();
		}
	}
}