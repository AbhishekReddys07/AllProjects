package hibernate_test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Details1 {
 public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m = e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Scanner sc=new Scanner(System.in);
	
	Details d=new Details();
	
	System.out.println("enter id");
	d.setId(sc.nextInt());
	System.out.println("enter name");
	d.setName(sc.next());
	System.out.println("enter address");
	d.setAddress(sc.next());
	
	t.begin();
	m.persist(d);
	t.commit();
	sc.close();
}
}
