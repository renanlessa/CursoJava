package br.com.flexxo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.flexxo.modelo.Aluno;

public class AlunoDAO extends SuperDAO<Aluno>{
	
	public List<Aluno> findAll() {
		Query query = super.em.createNamedQuery("aluno.todos");
		
		return query.getResultList();
	}
}