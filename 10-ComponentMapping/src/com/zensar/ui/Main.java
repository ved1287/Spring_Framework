package com.zensar.ui;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.bean.Address;

import com.zensar.bean.Student;
import com.zensar.util.HibernateUtil;

public class Main {
	static void demo1() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Address address=new Address();
		address.setDoorNo("A-10");
		address.setAreaName("BAWADHAN");
		address.setCityName("PUNE");
		
		Student student=new Student();
		student.setName("AAYANSH");
		student.setAddress(address);
		Transaction tx=session.beginTransaction();
		session.save(student);
		
		
		
		tx.commit();
		HibernateUtil.cleanUp();
	}
	static void demo2() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		 Student student=null;
	        student=session.load(Student.class, 1);
	        System.out.println(student);
		
		
		HibernateUtil.cleanUp();
	}
	static void demo3() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
        Student student=null;
       
        
        student=session.load(Student.class, 2);
        student.setName("AAYANSH SINGH");
        Transaction tx=session.beginTransaction();
        session.update(student);
        tx.commit();
        System.out.println(student);
        HibernateUtil.cleanUp(); 
	}
	
	public static void main(String[] args) {
		demo3();
	}

}
