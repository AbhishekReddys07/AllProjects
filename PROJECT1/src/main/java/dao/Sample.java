package dao;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Demo;



public class Sample {
	EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
	EntityManager m = e.createEntityManager();
	EntityTransaction t = m.getTransaction();
	Scanner sc = new Scanner(System.in);

	public void add(String name, byte[] video, String secret, String address, long number) {
		Demo d = new Demo();

		d.setName(name);
		d.setVideo(video);
		d.setAddress(AES.encrypt(address, secret));
		d.setNumber(number);
		t.begin();
		m.persist(d);
		t.commit();
		System.out.println("added\n");
	}

	public void update(int id, String newName) {
		Demo d = m.find(Demo.class, id);
		d.setName(newName);
		t.begin();
		m.merge(d);
		t.commit();
		System.out.println("updated\n");
	}

	public void remove(int id) {
		Demo d = m.find(Demo.class, id);
		t.begin();
		m.remove(d);
		t.commit();
		System.out.println("removed\n");
	}

	public void fetchOnlyVideo(int id) throws Exception {
		Demo d = m.find(Demo.class, id);
		System.out.println("enter the path");
		FileOutputStream f1 = new FileOutputStream(sc.nextLine());
		f1.write(d.getVideo());
		System.out.println("fetched the video\n");
	}

	public void fetchAll(int id, String secret) {
		Demo d = m.find(Demo.class, id);
		System.out.println("id-->" + d.getId());
		System.out.println("name-->" + d.getName());
		System.out.println("address-->" + AES.decrypt(d.getAddress(), secret));
		System.out.println("phon number-->" + d.getNumber());
		System.out.println("itime-->" + d.getInsertion_date_time());
		System.out.println("utime" + d.getUpdatation_date_time());
		System.out.println("fetched all but video\n");
	}

	public void fetchId_Name() {
		Query q = m.createQuery("select a from JEHA9 a");
		List<Demo> l = q.getResultList();
		for (Demo f : l) {
			System.out.println(f.getId());
			System.out.println(f.getName());
		}
		System.out.println("fetched Id & name of all persons");
	}
}
