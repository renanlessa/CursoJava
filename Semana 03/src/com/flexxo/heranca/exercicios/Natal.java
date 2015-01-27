package com.flexxo.heranca.exercicios;

public class Natal extends CartaoWeb {
	
	public Natal(String destinatario) {
		this.destinatario = destinatario;
	}
	
	@Override
	public void showMessage() {
		System.out.println("Feliz Natal " + this.destinatario);
	}
}