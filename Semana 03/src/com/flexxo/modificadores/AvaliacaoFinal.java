package com.flexxo.modificadores;

public class AvaliacaoFinal {
	
	/*
	 * Membros declarados com o modificador final são membros constantes, 
	 * ou seja, cujo valor não pode ser mais modificado.
	 */
	
	final int numeroDeProvas=2; // um membro final deve ser inicializado na declaração 
	final int numeroDeTrabalhos=4; // ou no construtor (veremos construtores mais tarde)
	
	public float[] trabalhos = new float[numeroDeTrabalhos]; 
	public float[] provas = new float[numeroDeProvas];
	
	// Um método declarado FINAL não poderá ser sobrescrito em subclasses da 
	// classe Avaliacao (veremos isso mais adiante)
	
	final public void teste() {
		// Essa linha causará um erro de compilação 
		numeroDeProvas = 5;
	}
}
