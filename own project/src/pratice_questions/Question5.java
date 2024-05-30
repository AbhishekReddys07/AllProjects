package pratice_questions;

import java.util.Scanner;

//aram strong number
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt(),a=sc.nextInt();
		//System.out.println("div num");
		
		int copy=num;
		int sum=0;
		while (num != 0) {
		//	System.out.println("enter a divi num");
			int d = num % a;
			int um=d;
			int fact = 1;
			for (int i = um; i >= 1; i--) {
				fact = fact * i;
			}
			sum=sum+fact;
			num=num/10;}
			if(copy==sum){
				System.out.println("Strong num");
			}else{
				System.out.println("not");
			}
		
	}
}
