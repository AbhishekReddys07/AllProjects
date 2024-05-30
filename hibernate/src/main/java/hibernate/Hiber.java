package hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hiber {
public static void main(String[] args) {
   EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
   EntityManager m=e.createEntityManager();
   EntityTransaction t=m.getTransaction();
   
   Hibernate h=new  Hibernate();
  h.setId(23);
  h.setName("Abhishek");
  h.setSal(45000);
  
  t.begin();
  m.persist(h);
  t.commit();
}
}
