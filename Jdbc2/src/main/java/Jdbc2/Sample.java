package Jdbc2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/img","root","root");
		PreparedStatement p=c.prepareStatement("insert into d values(?,?)");
		p.setInt(1, 1);
		System.out.println("hah");
		FileInputStream f=new FileInputStream(sc.next());
		p.setBinaryStream(2,f,f.available());
		p.executeUpdate();
	
		
		
		c.close();
		System.out.println();
		
		
		
	}
}
