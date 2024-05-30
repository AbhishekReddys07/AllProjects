package unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Student s=new Student();
		s.setAddress("Bangalore");
		s.setId(1);
		s.setName("Abhishek");

		Student s2=new Student();
		s2.setAddress("mumbai");
		s2.setId(2);
		s2.setName("nagu");
		
		Stream ss=new Stream();
		ss.setCode(1);
		ss.setName("Abhishek");
		ss.setStream("cse");
		
		Stream ss1=new Stream();
		ss1.setCode(2);
		ss1.setName("nagu");
		ss1.setStream("cse");
		
	
	

	  List <Student>l=new ArrayList<Student>();
	  //l.addAll(s1);
	  l.add(s);
	  l.add(s2);
	
		t.begin();
		m.persist(s);
		m.persist(ss);
		m.persist(ss1);
		m.persist(s2);
		t.commit();
		System.out.println("completed");
	}
	
}
