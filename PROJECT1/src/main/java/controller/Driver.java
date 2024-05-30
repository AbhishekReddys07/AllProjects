package controller;

import java.io.FileInputStream;
import java.util.Scanner;
import dao.Sample;

public class Driver {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Sample s = new Sample();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"1.Add\n2.Update\n3.Remove\n4.fetch_only_vedio\n5.fetchall_but_vedio\n6.fetch_Id_NameOfPersons\n7.Exit");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter the name");
				String name = sc.next();
				System.out.println("enter the video path");
				Scanner sc2 = new Scanner(System.in);
				FileInputStream f = new FileInputStream(sc2.nextLine());
				byte[] video = new byte[f.available()];
				f.read(video);
				System.out.println("enter the address");
				String address = sc.next();
				System.out.println("enter the secret key");
				String secret = sc.next();
				System.out.println("enter the phone number");
				long number = sc.nextLong();
				s.add(name, video, secret, address, number);
			}
				break;
			case 2: {
				System.out.println("enter the id");
				int id = sc.nextInt();
				System.out.println("enter the new name");
				String newName = sc.next();
				s.update(id, newName);
			}
				break;
			case 3: {
				System.out.println("enter the id");
				int id = sc.nextInt();
				s.remove(id);
			}
				break;
			case 4: {
				System.out.println("enter the id");
				int id = sc.nextInt();
				s.fetchOnlyVideo(id);
			}
				break;
			case 5: {
				System.out.println("enter the id");
				int id = sc.nextInt();
				System.out.println("enter the secret key");
				String secret = sc.next();
				s.fetchAll(id, secret);
			}
				break;
			case 6: {
				System.out.println("enter the id");
				int id = sc.nextInt();
				s.fetchId_Name();
			}
				break;
			case 7: {
				flag = false;
				System.out.println("byee byeee");
			}
				break;
			default: {
				System.out.println("enter valid option");
			}
				break;
			}
		}
		sc.close();
		
	}
}
