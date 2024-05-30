package practise_questions;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int square=2;
		while(num!=0){
			int ans=num*num;
			System.out.println(ans);
			break;
		}
	}
}
