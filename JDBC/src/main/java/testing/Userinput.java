package testing;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Userinput {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/loa","root","root");
	    Statement p=Connection.createStatement();
	    boolean b= p.execute("create table det(id Integer(4),name varchar(20))");
		System.out.println(b);
		Connection.close();
		
	}
}
