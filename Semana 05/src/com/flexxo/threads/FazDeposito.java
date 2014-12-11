package com.flexxo.threads;

public class FazDeposito implements Runnable {
	
	private Conta c1;
	
	FazDeposito(Conta conta) {
		this.c1 = conta;
	}
	
	@Override
	public void run() {
		c1.deposito(100.0);
	}
	
}
