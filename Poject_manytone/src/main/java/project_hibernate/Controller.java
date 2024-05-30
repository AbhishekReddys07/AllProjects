package project_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();

//		User1 u1 = new User1();
//		u1.setName("Abhishek");
//		u1.setAddress("Bangalore");
//		u1.setPan_num(1234);

		User1 u = new User1();
		u.setAddress("mumbai");
		u.setName("john");
		u.setPan_num(33455);

		Bank_SBI bank_SBI = new Bank_SBI();
		bank_SBI.setAcc_no(1001);
		bank_SBI.setAddress("bangalore");
		bank_SBI.setName("Abhishek");
		bank_SBI.setPan_num(1234);
		
		u.setBank_SBI(bank_SBI);
		bank_SBI.setU(u);

		t.begin();
		m.persist(u);
		m.persist(bank_SBI);
		t.commit();

		System.out.println("end**!!.......");
	}

}
