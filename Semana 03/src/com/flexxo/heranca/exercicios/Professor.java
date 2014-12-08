package com.flexxo.heranca.exercicios;

public class Professor extends EmpregadoDaFaculdade {

	private int horasAula;

	public double getGastos() {
		return super.getGastos() + horasAula * 15.0;
	}
	
	public String getInfo() {
		return super.getInfo() + "\nMeu total de horas aula: " + this.horasAula;
	}
	
	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}
}