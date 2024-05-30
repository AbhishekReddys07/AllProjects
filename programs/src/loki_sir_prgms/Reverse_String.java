package loki_sir_prgms;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String a=sc.nextLine();
		sc.close();
		String rev="";
		for(int i=0;i<=a.length()-1;i--){
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);

	}

}
