package com.flexxo.heranca.exercicios;

public class GeradorDeRelatorio {
	
	public void imprimeRelatorio(EmpregadoDaFaculdade edf) {
		System.out.println("Gastos totais: " + edf.getGastos());
		System.out.println(edf.getInfo());
	}
}
