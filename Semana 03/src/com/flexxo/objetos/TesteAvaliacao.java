package com.flexxo.objetos;

public class TesteAvaliacao {
	public static void main(String[] args) {
		// Acessando os membros da classe carteira de estudante:
		Avaliacao notas = new Avaliacao();
		// Note que um valor inválido pode ser atribuído 
		// a um membro público de uma classe 
		notas.trabalhos[0] = -4.5F; // Nota menor que zero 
		notas.provas[1] = 20F; // Nota maior que 10
	}
}