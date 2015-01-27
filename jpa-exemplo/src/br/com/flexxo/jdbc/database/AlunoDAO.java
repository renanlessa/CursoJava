package br.com.flexxo.jdbc.database;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.flexxo.jdbc.modelo.Aluno;

public class AlunoDAO extends SuperDAO<Aluno>{
	
	public AlunoDAO(EntityManager entityManager) {
		super(entityManager);
	}

	public List<Aluno> findAll() {
		Query query = super.em.createNamedQuery("aluno.todos");
		
		return query.getResultList();
	}
}