package br.com.flexxo.jdbc.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	static EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("flexxo");
	
	public static EntityManager getEntityManager() {
		return createEntityManagerFactory.createEntityManager();
	}
}
