package com.flexxo.ramificacoes;

public class IfElse01 {
	public static void main(String[] args) {
		int maior = 10;
		int menor = 5;
		
		if (maior > menor)
		{
			// (10 > 5) = true
			System.out.println(maior + ">" + menor);
		}
		else 
		{
			// (10 < 5) != true
			System.out.println(menor + ">" + maior);
		}
		
		boolean vardade = (10 > 5);
		if(vardade)
		{	
			// (10 > 5) = true
			System.out.println(maior + ">" + menor);
		}
		else 
		{
			// (10 < 5) != true
			System.out.println(menor + ">" + maior);
		}
	}
}
