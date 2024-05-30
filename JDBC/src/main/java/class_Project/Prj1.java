package class_Project;


import java.sql.*;
import java.util.Scanner;

public class Prj1 {

	public static void main(String[] args) throws Exception {
		//Scanner sc=new Scanner(System.in);
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	  //  boolean flag=true;
	    PreparedStatement s=c.prepareStatement("drop database movies");
	   int i= s.executeUpdate();
	   System.out.println(i);
//	    s.setInt(1,1);
//	    FileInputStream f=new FileInputStream("C:\\Users\\sudarshan Reddy\\OneDrive\\Desktop\\img\\shiva.jpeg");
//	    s.setBinaryStream(2,f,f.available());
//	    s.executeUpdate();
	    //int a=sc.nextInt();
//	    while(flag){
//	    switch(a){
//	    case 1:
//	    	
//	    	System.out.println("enter id");
//	    	int id=sc.nextInt();
//	    	System.out.println("enter name");
//	    	String name=sc.next();
//	    	System.out.println("enter address");
//	    	String add=sc.nextLine();
//
//	    	 PreparedStatement p=c.prepareStatement("insert into details values(?,?,?)");
//	    	 p.setInt(1, id);
//	    	 p.setString(2,name);
//	    	 p.setString(3, add);
//	    	p.executeUpdate();
//	    
//	    }break;
//	    }
	}
}
