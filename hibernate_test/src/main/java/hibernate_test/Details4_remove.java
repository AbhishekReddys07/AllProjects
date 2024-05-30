package hibernate_test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Details4_remove {

	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Details d=m.find(Details.class, 1);
		t.begin();
		m.remove(d);
		t.commit();
		
	}
}
