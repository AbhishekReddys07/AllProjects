package hibernate_test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Details3_update {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		Scanner sc=new Scanner(System.in);
		
		Details d=m.find(Details.class, 2);
		System.out.println("enter address");
		t.begin();
		d.setAddress(sc.next());
		m.merge(d);
		t.commit();
		sc.close();
	}

}
