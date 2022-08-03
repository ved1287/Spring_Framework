package com.zensar.ui.pack1;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.ContactInfo;
import com.zensar.bean.pack1.Person;
import com.zensar.util.JPAUtil;

public class Main {
	static void test1() {
        Person person=new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);

        ContactInfo contactinfo=new ContactInfo("John@gmail.com", "9764736738");
        person.setContactinfo(contactinfo);
       

        EntityManager em=JPAUtil.createEntityManager("PU");
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        JPAUtil.shutDown();


    }
	static void test2() {
		ContactInfo contactinfo=new ContactInfo("ved245@gmail.com","2457876788");
		 EntityManager em=JPAUtil.createEntityManager("PU");
		 em.getTransaction().begin();
	        em.persist(contactinfo);
	        em.getTransaction().commit();
	        JPAUtil.shutDown();
	}
	static void test3(){
		Person person=new Person(151,"veda",LocalDate.of(1998, 3, 12),'M',null);
		EntityManager em=JPAUtil.createEntityManager("PU");
		ContactInfo contactinfo=em.find(ContactInfo.class, 2);
		person.setContactinfo(contactinfo);
		em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        JPAUtil.shutDown();
		
	}
	static void test4() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		ContactInfo contactinfo=em.find(ContactInfo.class, 2);
		System.out.println(contactinfo);
		 JPAUtil.shutDown();
	}
	static void test5() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Person person=em.find(Person.class, 101);
		System.out.println(person);
		System.out.println(person.getContactinfo());
		 JPAUtil.shutDown();
	}
	static void test6() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		Person person=em.find(Person.class, 101);
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	public static void main(String[] args) {
		test1();
	}

}
