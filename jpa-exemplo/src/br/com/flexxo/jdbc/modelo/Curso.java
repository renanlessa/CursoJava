package br.com.flexxo.jdbc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="SEQ_CURSO", sequenceName="SEQ_CURSO", initialValue = 1)
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="SEQ_CURSO")
	private int cdCurso;

	@Column(nullable = false, length = 200)
	private String nome;

	public int getCdCurso() {
		return cdCurso;
	}
	public void setCdCurso(int cdCurso) {
		this.cdCurso = cdCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}