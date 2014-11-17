package com.flexxo.tipos;

public class PromocaoCasting {
	//Apesar 6 ser um inteiro, o valor da variavel grande
	//continua sendo do tipo long
	long grande = 6;
	
	//uma variavel do tipo inteiro não possui
	//espaço para armazenar um valor longo
	int pequeno = 99L;
	
	float a = 12.121F; //correto
	float b = 12.121;  // 12.121 é um double
}
