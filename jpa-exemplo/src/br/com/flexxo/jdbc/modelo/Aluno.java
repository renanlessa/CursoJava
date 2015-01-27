package br.com.flexxo.jdbc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="SEQ_ALUNO", sequenceName="SEQ_ALUNO", initialValue = 1)
@NamedQueries({
	@NamedQuery(name = "aluno.todos", query = "SELECT a FROM Aluno a")
})
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="SEQ_ALUNO")
	private int cdAluno;
	
	@Column(nullable = false, length = 200)
	private String nome;
	
	@PrePersist
	private void antesDePersistir() {
		System.out.println(this.cdAluno);
		System.out.println(this.nome);
	}
	
	@PostPersist
	private void depoisDePersistir() {
		System.out.println(this.cdAluno);
		System.out.println(this.nome);
	}
	
	public int getCdAluno() {
		return cdAluno;
	}
	public void setCdAluno(int cdAluno) {
		this.cdAluno = cdAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}