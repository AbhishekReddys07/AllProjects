package mapping_many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller7 {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
	Person7 p=new Person7();
	p.setAddress("bangalore");
	p.setName("Chaithra");
	p.setNum(143);
	
	Pancard7 p1=new Pancard7();
	p1.setName("Chaithra");
	p1.setNum(143);
	p1.setAddress("bang");
		
	
	p.setP(p1);
	
	t.begin();
	m.persist(p);
	m.persist(p1);
	t.commit();
		System.out.println("operation completed");
	}
}
