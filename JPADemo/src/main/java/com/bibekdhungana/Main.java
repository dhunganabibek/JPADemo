package com.bibekdhungana;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Bibek");
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("myApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		
		System.out.println("Done");
	}

}
