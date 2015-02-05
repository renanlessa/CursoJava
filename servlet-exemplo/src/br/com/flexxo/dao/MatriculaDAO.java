package br.com.flexxo.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.flexxo.modelo.Matricula;

public class MatriculaDAO extends SuperDAO<Matricula> {

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
