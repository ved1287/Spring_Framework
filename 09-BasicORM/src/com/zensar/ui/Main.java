package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.zensar.bean.Employee;
import com.zensar.util.HibernateUtil;



public class Main {
	static void demo1() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Employee employee=new Employee();
        employee.setName("veda");
        employee.setDateOfJoin(LocalDate.of(2022, 02, 10));
        employee.setBasic(500000.00);
        employee.setGrade('A');
        Transaction tx=session.beginTransaction();
        session.save(employee);
        tx.commit();
        HibernateUtil.cleanUp();
	}

	static void demo2() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Employee employee=null;
        employee=session.load(Employee.class, 1);
        System.out.println(employee);
        HibernateUtil.cleanUp(); 
        
	}
        
	static void demo3() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Employee employee=null;
        
        employee=session.load(Employee.class, 1);
        employee.setBasic(600000);
        Transaction tx=session.beginTransaction();
        session.update(employee);
        tx.commit();
        System.out.println(employee);
        HibernateUtil.cleanUp(); 
        
		
	}
	static void demo4() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
	        String str="from Employee";
	        Query query=session.createQuery(str);
	        List<Employee> allEmployees=query.list();
	        System.out.println(allEmployees);
	        HibernateUtil.cleanUp(); 
		
	}
	static void demo5() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Employee employee=null;
        
        employee=session.load(Employee.class, 1);
        employee.setBasic(600000);
        Transaction tx=session.beginTransaction();
        session.delete(employee);
        tx.commit();
        
        HibernateUtil.cleanUp(); 
		
	}
	public static void main(String[] args) {
		demo1();
	}
}
