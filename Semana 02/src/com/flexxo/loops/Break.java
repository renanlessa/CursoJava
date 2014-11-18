package com.flexxo.loops;

public class Break {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		
		for (int conteudo : array) {
			System.out.println(conteudo);
			if(conteudo == 3)
				break;
		}
	}
}