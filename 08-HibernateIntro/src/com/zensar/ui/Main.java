package com.zensar.ui;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.zensar.bean.Person;
import com.zensar.util.HibernateUtil;

public class Main {
	static void demo1() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Person person=new Person();
        person.setName("vedpr");
        person.setSalary(560000.00);
        Transaction tx=session.beginTransaction();
        session.save(person);
        tx.commit();
        HibernateUtil.cleanUp();
	}
	static void demo2() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Person person=null;
        person=session.load(Person.class, 2);
        System.out.println(person);
        HibernateUtil.cleanUp();
       
	}
	static void demo3() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
        Person person=null;
        
        person=session.load(Person.class, 1);
        person.setSalary(600000);
        Transaction tx=session.beginTransaction();
        session.update(person);
        tx.commit();
        System.out.println(person);
        HibernateUtil.cleanUp();
       
	}
	static void demo4() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
	 
        String str="from Person";
        Query query=session.createQuery(str);
        List<Person> allPersons=query.list();
        System.out.println(allPersons);
        HibernateUtil.cleanUp();
	}
        static void demo5() {
        	HibernateUtil.init();
    		Session session=HibernateUtil.getSession();
    		
            Person person=null;
            
            person=session.load(Person.class, 1);
            person.setSalary(600000);
            Transaction tx=session.beginTransaction();
            session.delete(person);
            tx.commit();
            HibernateUtil.cleanUp();
            
           
		
	}
	public static void main(String[] args) {
		demo1();
	}



		
	}
