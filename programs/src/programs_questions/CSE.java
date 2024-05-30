package programs_questions;

import java.util.Scanner;

public class CSE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter boy value");
		int boys=sc.nextInt();
		System.out.println("enter girls values");
		int girls=sc.nextInt();
		
		int t=boys+girls;int count =0;
		for (int i = 0; i <=t-1; i++) {
			
			count++;
		}
		System.out.println(count);
		
		
	}
}
