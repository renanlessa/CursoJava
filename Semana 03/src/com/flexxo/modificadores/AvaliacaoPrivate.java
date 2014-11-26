package com.flexxo.modificadores;

public class AvaliacaoPrivate {
	final int numeroDeProvas = 2; 
	final int numeroDeTrabalhos = 4;
	
	// Observe que os membros agora são privados. Só podem ser acessados 
	// pelo objeto que os possui.
	
	private float[] trabalhos = new float[numeroDeTrabalhos];
	private float[] provas = new float[numeroDeProvas];
	
	public void atualizarNotaDeTrabalho(int numeroDoTrabalho, float nota) {
		// Verifica se o índice da nota é válido
		if(numeroDoTrabalho > -1 && numeroDoTrabalho < numeroDeTrabalhos) {
			if(nota >= 0F && nota <= 10F) {
				trabalhos[numeroDoTrabalho] = nota;
			} else {
				System.out.println("nota inválida");
			}
			
		} else {
			System.out.println("número do trabalho inválido");
		}
	}
}