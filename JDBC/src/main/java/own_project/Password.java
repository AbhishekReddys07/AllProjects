package own_project;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class Password {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String uname=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/password","root","root");
	   Statement s=c.createStatement();
	   boolean e=s.execute("insert into uname value('Abhishek')");
	   c.close();
		System.out.println(e);
		
	}
}
