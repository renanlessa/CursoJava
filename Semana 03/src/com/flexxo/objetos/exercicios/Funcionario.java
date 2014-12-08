package com.flexxo.objetos.exercicios;

public class Funcionario {
	
	private String nome;
	private String rg;
	private String departamento;
	private double salario;
	private Data dataAdmissao;
	private boolean ativo;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		this.ativo = true;
	}
	
	public void bonifica(double bonificacao) {
		salario += bonificacao;
	}
	
	public void demite() {
		ativo = false;
	}
	
	public void imprimeFuncionario() {
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Rg: " + rg);
		System.out.println("Data Admissao: " + dataAdmissao.getDia() + "/" + dataAdmissao.getMes() + "/" + dataAdmissao.getAno());
		System.out.println("Salario: " + salario);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public Data getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}