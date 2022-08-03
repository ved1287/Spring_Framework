package com.zensar.ui.pack1;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.Address;
import com.zensar.bean.pack1.Employee;
import com.zensar.util.JPAUtil;

public class Main {
	static void test1() {
        Employee employee=new Employee(148, "Ved", 12000.00, null);

        Address address=new Address("A-7","Pune", "HDR", null);
        employee.setAddress(address);
        address.setEmployee(employee);

        EntityManager em=JPAUtil.createEntityManager("PU");
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        JPAUtil.shutDown();


    }
	public static void main(String[] args) {
		test1();
	}

}
