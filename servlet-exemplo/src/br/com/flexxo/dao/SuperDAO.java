package br.com.flexxo.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SuperDAO<T> {
	
	private EntityManagerFactory createEntityManagerFactory;
	
	protected EntityManager em;
	
	protected Class<T> entityClass = getDomainClass();
	
	public SuperDAO() {
		createEntityManagerFactory = Persistence.createEntityManagerFactory("flexxo");
		this.em = createEntityManagerFactory.createEntityManager();
	}
	
	protected Class getDomainClass() {
		if(entityClass == null) {
			ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
			entityClass = (Class) thisType.getActualTypeArguments()[0];
		}
		return entityClass;
	}
	
	public void insere(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}
	
	public void altera(T t) {
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}
	
	public void deleta(int key) {
		em.getTransaction().begin();
		T t1 = procura(key);
		em.remove(t1);
		em.getTransaction().commit();
	}
	
	public T procura(int key) {
		return em.find(entityClass, key);
	}
}
