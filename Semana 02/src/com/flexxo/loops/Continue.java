package com.flexxo.loops;

public class Continue {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		
		for (int conteudo : array) {
			if (conteudo == 3)
				continue;
			
			System.out.println(conteudo);
		}
	}
}