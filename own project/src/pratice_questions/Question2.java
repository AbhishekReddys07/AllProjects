package pratice_questions;

import java.util.Scanner;
//question2-write a program to remove vowels from given string;
public class Question2 {

	static void name(String str) {
		String h = "";
		int c = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			c++;
			if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') == false) {

				h = h + ch;
				count++;
			}
		}
		System.out.println("Before removing vowles the count is-->" + "\t" + c);
		System.out.println(h);
		System.out.println("After removing vowles thr count is-->" + "\t" + count);

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine().toUpperCase();
		name(str);
		sc.close();
	}
}
