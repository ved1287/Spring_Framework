package com.zensar.ui.pack1;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.Doctor;
import com.zensar.util.JPAUtil;

public class Main1 {
	public static void main(String[] args) {
		Doctor doctor1=new Doctor("VED",9400,"MALE",LocalDate.of(2022, 12, 15));
		Doctor doctor2=new Doctor("VEDA",3400,"MALE",LocalDate.of(2022, 12, 18));
		Doctor doctor3=new Doctor("VEDANSH",2400,"MALE",LocalDate.of(2022, 12, 5));
		Doctor doctor4=new Doctor("VEDPRAKASH",1400,"MALE",LocalDate.of(2022, 12, 25));
		Doctor doctor5=new Doctor("VEDAKRISHAN",800,"FEMALE",LocalDate.of(2022, 12, 22));
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(doctor1);
		em.persist(doctor2);
		em.persist(doctor3);
		em.persist(doctor4);
		em.persist(doctor5);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		System.out.println("Doctor data saved");
	}

}
