package br.com.flexxo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="SEQ_MATRICULA", sequenceName="SEQ_MATRICULA", initialValue = 1)
@NamedQueries({
	@NamedQuery(name = "matricula.todas", query = "SELECT m FROM Matricula m"),
	@NamedQuery(name = "matricula.porNomeAluno", query = "SELECT m FROM Matricula m WHERE m.aluno.nome LIKE :nome")
})
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="SEQ_MATRICULA")
	private int cdMatricula;
	
	@ManyToOne
	@JoinColumn(name = "cdaluno")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "cdcurso")
	private Curso curso;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInicio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtFim;
	
	public int getCdMatricula() {
		return cdMatricula;
	}

	public void setCdMatricula(int cdMatricula) {
		this.cdMatricula = cdMatricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
}