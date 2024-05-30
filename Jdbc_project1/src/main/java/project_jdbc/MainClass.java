package project_jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.crypto.spec.PSource;


public class MainClass {

	public static void main(String[] args) throws Exception {
	     Scanner sc=new Scanner(System.in);
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/presentation_tracking","root","root");
//        PreparedStatement p=c.prepareStatement("create table details(id int ,name varchar(50),topic varchar(50),date varchar(12),start_time varchar(20),end_time varchar(20),photo blob,seal blob) ");
//        boolean b= p.execute();
//       System.out.println(b);
		boolean flag= true;
		System.out.println("1.add\n2.fetch\n3.update\n4.update_img\n5.rename\n6.exit");
		System.out.println("enter valid number");
		int num=sc.nextInt();
		while(flag){
			
			switch (num) {
			case 1:{
				PreparedStatement p=c.prepareStatement("insert into details values(?,?,?,?,?,?,?,?)");
				System.out.println("enter id");
				p.setInt(1, sc.nextInt());
				System.out.println("enter name");
				p.setString(2,sc.next());
				System.out.println("enter topic");
				p.setString(3, sc.next());
				System.out.println("enter date");
				p.setDate(4, Date.valueOf(sc.next()));
				System.out.println("start time");
				p.setString(5, sc.next());
				System.out.println("end time");
				p.setString(6, sc.next());
				System.out.println("enter photo path along with presentage img name");
				FileInputStream f=new FileInputStream(sc.next());
				p.setBinaryStream(7, f,f.available());
				System.out.println("enter photo path along with seal img name");
				FileInputStream f1=new FileInputStream(sc.next());
				p.setBinaryStream(8, f1,f1.available());
				int r=p.executeUpdate();
				System.out.println("successfully added");
				System.out.println(r);
				}break;
			case 2:{
				PreparedStatement p=c.prepareStatement("select * from details where date=?");
				p.setDate(1, Date.valueOf(sc.next()));
				ResultSet r=p.executeQuery();
				while(r.next()){
					System.out.println(r.getInt(1));
					System.out.println(r.getString(2));
					System.out.println(r.getString(3));
					System.out.println(r.getDate(4));
					System.out.println(r.getString(5));
					System.out.println(r.getString(6));
					Blob b=r.getBlob(1);
					FileOutputStream f=new FileOutputStream("C:\\img\\fetch.jpg");
					f.write(b.getBytes(1,(int)b.length()));
					Blob b1=r.getBlob(1);
					FileOutputStream f1=new FileOutputStream("C:\\img\\fetch2.jpg");
					f.write(b1.getBytes(1,(int)b1.length()));
					break	;			}
			}
			case 3:{
				
			}break;
			case 4:{
				
			}break;
			case 5:{
				
			}break;
			case 6:{
				flag=false;
				System.out.println("application is closed");
			}break;
				
			    
			default:
				System.out.println("invalid option");
				break;
			
			}
		}
		
		sc.close();
	}

}
