package testing;
import java.sql.*;
public class Sample {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
		Statement s=co.createStatement();
	      boolean e=s.execute("rename table from details as movies");
		System.out.println("details update");
		System.out.println(e);
		
		
		co.close();
		

	}

}
