package com.flexxo.heranca;

public class TestaHeranca {
	public static void main(String[] args) {
		
		SomaBonificacao sb = new SomaBonificacao();
		
		//Funcionario funcionario = new Funcionario();
		//funcionario.nome = "Joao";
		//funcionario.salario = 1000.0;
		
		//sb.adiciona(funcionario);
		
		//System.out.println(funcionario.getBonus());
		
		
		Gerente gerente = new Gerente();
		gerente.nome = "Pedro";
		gerente.salario = 2000.0;
		gerente.setSenha("123");
		gerente.getInfo();
		
		
		sb.adiciona(gerente);
		
		
		
		System.out.println(gerente.getBonus());
		
		Desenvolvedor desenv = new Desenvolvedor();
		desenv.nome = "Maria";
		desenv.salario = 1500.0;
		
		sb.adiciona(desenv);
		
		System.out.println(desenv.getBonus());
		
		
		sb.imprimeTotal();
		
	}
}