package bydirection;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		
		Person p=new Person();
		p.setAddress("bang");
		p.setName("abhi");
		p.setNum(12);
		
		Pancard1 card=new Pancard1();
	   card.setAddress("bang");
	   card.setName("abhi");
	   card.setPan_num(12);
	   
	   
	   p.setCard(card);
	   t.begin();
	   m.persist(p);
	   m.persist(card);
	   t.commit();
	   
	   
	   System.out.println("completed");
		
		sc.close();
	}
}
