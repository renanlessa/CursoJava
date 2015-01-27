package com.flexxo.excecoes;

public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Titular titular;

	public Conta(Titular titular) {
		this.titular = titular;
	}

	public Conta(int numero, Titular titular) {
		this(titular);
		this.numero = numero;
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	public void saca(double quantidade) {
		this.saldo -= quantidade;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}
}