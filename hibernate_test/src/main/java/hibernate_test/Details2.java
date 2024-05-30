package hibernate_test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Details2 {

	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		Scanner sc=new Scanner(System.in);
//		int i; 
		System.out.println("enter number");
//		int n=sc.nextInt();
//		for (i = 1; i <=n; i++) {
			
		
		Details d=m.find(Details.class, 1);
	    if(d!=null){
	    	System.out.println(d.getId());
	    	System.out.println(d.getName());
	    	System.out.println(d.getAddress());
	   }
	    else
	    System.out.println("no data  ");//}
		sc.close();
	}
}
