package com.flexxo.threads;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public synchronized void deposito(double quantidade) {
		saldo += quantidade;
	}
}