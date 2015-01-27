package com.flexxo.objetos.exercicios;

/*
 * Escreva uma classe que represente um país. 
 * Um país é representado através dos atributos: 
 * 1. código ISO 3166-1 (ex.: BRA), 
 * 2. nome (ex.: Brasil), 
 * 3. população (ex.: 193.946.886) 
 * 4. dimensão em Km2 (ex.: 8.515.767,049).
 * 
 * Escreva a classe em java e forneça os seus membros a seguir:
 * 
 * a) Construtor que inicialize o código ISO, o nome e a dimensão do país; 
 * b) Métodos de acesso (getter/setter) para as propriedades código ISO, nome, população e dimensão do país; 
 * c) Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). 
 * Dois países são iguais se tiverem o mesmo código ISO;
 * d) Um método que imprima no console todas informações disponiveis sobre o pais (ISO,nome...etc);
 * 
 */

public class Pais {
	private String codigo;
	private String nome;
	private float populacao;
	private float dimensao;
	
	public Pais(String codigo, String nome, float dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	public boolean ehIgual(Pais pais) {
		if(this.getCodigo().equals(pais.getCodigo())) {
			return true;
		} else {
			return false;
		}
	}
	
	public void imprimePais() {
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("População: " + this.populacao);
		System.out.println("Dimensão: " + this.dimensao);
	}
	
	/*
	 * gets e sets
	 */
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPopulacao() {
		return populacao;
	}
	public void setPopulacao(float populacao) {
		this.populacao = populacao;
	}
	public float getDimensao() {
		return dimensao;
	}
	public void setDimensao(float dimensao) {
		this.dimensao = dimensao;
	}
}