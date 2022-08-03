package com.zensar.ui.pack1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.zensar.bean.pack1.Doctor;
import com.zensar.util.JPAUtil;

public class Main3 {
	static void test1() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Query query=em.createNamedQuery("readAll",Doctor.class);
		List doctors=query.getResultList();
		System.out.println(doctors);
		JPAUtil.shutDown();
		
	}
	static void test2() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor>query=em.createNamedQuery("readById",Doctor.class);
		query.setParameter(1,6);
		Doctor doctor=query.getSingleResult();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}
	static void test3() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor>query=em.createNamedQuery("readByfees",Doctor.class);
		query.setParameter(1,800);
		query.setParameter(2,10000);
		
		List<Doctor> doctor=query.getResultList();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		test3();
	}

}
