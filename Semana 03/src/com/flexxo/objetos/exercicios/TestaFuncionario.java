package com.flexxo.objetos.exercicios;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("Joao", 900.5);
		func.setDepartamento("Recursos Humanos");
		func.setRg("2342345");
		func.bonifica(250.0);
		
		Data data = new Data(20, 7, 2012);
		
		func.setDataAdmissao(data);
		
		System.out.println(func.getSalario());
		System.out.println(func.isAtivo());
		
		func.imprimeFuncionario();
	}
}