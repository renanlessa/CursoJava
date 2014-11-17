package com.flexxo.ramificacoes;

public class Switch05 {
	public static void main(String[] args) {
		String diaDaSemana = "Quarta";
		switch (diaDaSemana)
		{
	        case "Segunda":
	            System.out.println("Inicio da Semana");
	            break;
	        case "Terca":
	        case "Quarta":
	        case "Quinta":
	        	System.out.println("Meio da Semana");
	            break;
	        case "Friday":
	        	System.out.println("Final da Semana");
	            break;
	        case "Sabado":
	        case "Domingo":
	        	System.out.println("Final de Semana");
	            break;
	        default:
	        	System.out.println("dia invalido");
		}
	}
}