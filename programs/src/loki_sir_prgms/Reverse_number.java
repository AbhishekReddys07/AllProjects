package loki_sir_prgms;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rev=0;
	while(num!=0){
	    rev=num%10;
		System.out.print(rev);
		num=num/10;
		
	}
	int cop=rev;
 if(cop==num){
	 System.out.print("palindrome");
 }else{
	 System.out.println("not palindrome");
 }
	
	
	
	
	
	
	 sc.close();
	}

}
