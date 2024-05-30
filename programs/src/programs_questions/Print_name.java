package programs_questions;

import java.util.Scanner;

public class Print_name {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("first name");
	String fn=sc.next();
	System.out.println("mid name");
	String mn=sc.next();
	System.out.println("lst name");
	String ln=sc.next();
	
	System.out.println(fn+mn+"."+ln);
	
	}
}
