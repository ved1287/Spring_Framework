package com.zensar.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.zensar.bean.Address;
import com.zensar.bean.Student;

public class Main {
	static void demo1() {
		Address address=new Address();
		address.setDoorNo("A-7");
		address.setAreaName("Haidarnagar");
		address.setCityName("PUNE");
		 Student student=new Student();
		 student.setName("VED");
		 student.setAddress(address);
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
    	 EntityManager em=emf.createEntityManager();
    	 em.getTransaction().begin();
    	 em.persist(student);
    	 em.getTransaction().commit();
    	 em.close();
    	 emf.close();	
		 
	}
	 static void demo2() {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
    	 EntityManager em=emf.createEntityManager();
    	Student student=null;
    	student=em.find(Student.class,1);
    	System.out.println(student);
    	 em.close();
    	 emf.close();	 
     }
	 static void demo3() {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
    	 EntityManager em=emf.createEntityManager();
    	Student student=null;
    	student=em.find(Student.class,1);
    	em.getTransaction().begin();
    	student.setName(student.getName().toLowerCase());
    	em.merge(student);
    	em.getTransaction().commit();
    	System.out.println(student);
    	 em.close();
    	 emf.close();	 
     }
	 static void demo4() {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAAssignment");
    	 EntityManager em=emf.createEntityManager();
    	Student student=null;
    	student=em.find(Student.class,1);
    	em.getTransaction().begin();
    	em.remove(student);
    	em.getTransaction().commit();
    	
    	 em.close();
    	 emf.close();	 
     }
	public static void main(String[] args) {
		demo4();
	}

}
