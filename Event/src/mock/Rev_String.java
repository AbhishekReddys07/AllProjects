package mock;

import java.util.Scanner;

public class Rev_String {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String na=name;
		sc.close();
	    String rev="";
	    for(int i=na.length()-1;i>=0;i--){
	    	rev=rev+na.charAt(i);
	    }
	    System.out.println(rev);
		}
	}


