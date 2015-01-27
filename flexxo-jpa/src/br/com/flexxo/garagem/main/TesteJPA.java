package br.com.flexxo.garagem.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.flexxo.garagem.modelo.Carro;

public class TesteJPA {

	public static void main(String[] args) {

		// Estados - transient - managed - detached

		Carro carro = new Carro();
		carro.setNome("Mustang SS");
		carro.setFabricante("Ford");
		carro.setAno(2012);
		carro.setCor("Branco");
		
		EntityManagerFactory createEntityManagerFactory = Persistence
				.createEntityManagerFactory("flexxo-jpa");
		
		EntityManager manager = createEntityManagerFactory
				.createEntityManager();

		manager.getTransaction().begin();

		manager.persist(carro);
		//manager.merge(carro);
		

		manager.getTransaction().commit();

		manager.close();
		
		System.exit(0);

	}

}
