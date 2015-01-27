package com.flexxo.heranca.exercicios;

public class DiaDosNamorados extends CartaoWeb {
	
	public DiaDosNamorados(String destinatario) {
		this.destinatario = destinatario;
	}
	
	@Override
	public void showMessage() {
		System.out.println("Feliz Dia Dos Namorados " + this.destinatario);
	}
}