package br.com.flexxo.jdbc.database;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.flexxo.jdbc.modelo.Matricula;

public class MatriculaDAO extends SuperDAO<Matricula> {

	public MatriculaDAO(EntityManager em) {
		super(em);
	}
	
	public List<Matricula> findAll() {
		String sql = "Select m FROM Matricula m";
		Query query = super.em.createQuery(sql);
		return query.getResultList();
	}
	
	public List<Matricula> findByNomeAluno(String nome) {
		Query query = super.em.createNamedQuery("matricula.porNomeAluno");
		query.setParameter("nome", nome);
		return query.getResultList();
	}
	
	
	
}
