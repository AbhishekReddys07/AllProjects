package pratice_questions;

import java.util.Scanner;

public class question1 {
 static void name(String str){
	 for(int i=0;i<str.length();i++){
		 char ch=str.charAt(i);
		 if((ch>='a' && ch<='z')||(ch>='0' && ch<='9'))
		 {
			 System.out.print(ch); 
		 }
		 
	 }
 }

	public static void main(String[] args) {
		// question-Write a program to remove special character from the given
		// string;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.next().toLowerCase();
    name(str);
    sc.close();
	}
}
