package com.flexxo.loops;

public class ForAprimorado {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("-");
		
		for (int conteudo : array) {
			System.out.println(conteudo);
		}
	}
}