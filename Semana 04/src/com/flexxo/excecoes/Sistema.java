package com.flexxo.excecoes;

public class Sistema {
	
	private String[] valores = new String[50];
	
	public void relatorio(int indice) throws ValorInexistenteException {
		
		if(indice >= 0 && indice < valores.length) {
			System.out.println(valores[indice]);
		} else {
			throw new ValorInexistenteException();
		}
	}
	
	public static void main(String[] args) {
		Sistema s = new Sistema();
		
		try {
			s.relatorio(50);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Erro de leitura de indice");
		}
		catch (ValorInexistenteException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}