package com.zensar.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Account;






public class Main {
	static void demo1() {
   	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
   	 EntityManager em=emf.createEntityManager();
   	 em.getTransaction().begin();
   	 Account account=new Account();
   	 account.setName("VED PRAKASH");
   	 account.setBalance(200000.00);
   	 account.setDateOfOpening(LocalDate.of(2022, 02, 15));
   	 em.persist(account);
   	 em.getTransaction().commit();
   	 em.close();
   	 emf.close();	 
    }
	  static void demo2() {
	    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
	    	 EntityManager em=emf.createEntityManager();
	    	Account account=null;
	    	account=em.find(Account.class,1);
	    	System.out.println(account);
	    	 em.close();
	    	 emf.close();	 
	     }
	  static void demo3() {
	    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
	    	 EntityManager em=emf.createEntityManager();
	    	Account account=null;
	    	account=em.find(Account.class,1);
	    	em.getTransaction().begin();
	    	account.setName(account.getName().toUpperCase());
	    	em.merge(account);
	    	em.getTransaction().commit();
	    	System.out.println(account);
	    	 em.close();
	    	 emf.close();	 
	     }
	  static void demo4() {
	    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
	    	 EntityManager em=emf.createEntityManager();
	    	Account account=null;
	    	account=em.find(Account.class,1);
	    	em.getTransaction().begin();
	    	em.remove(account);
	    	em.getTransaction().commit();
	    	
	    	 em.close();
	    	 emf.close();	 
	     }
	 public static void main(String[] args) {
    	 demo4();
     }

}
