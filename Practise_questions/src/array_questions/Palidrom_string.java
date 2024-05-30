package array_questions;

import java.util.Scanner;

public class Palidrom_string {
//write a program the user enter String is palidrom or not without using in built method or for loop
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String str=sc.nextLine();
		System.out.println(str);
		int i=0;
		int j=str.length();
		char[]s=str.toCharArray();
		char[]c=str.toCharArray();
		
		while(str!=null){
			if(s[i]==c[j-1]){
				i++;
				j--;
				System.out.println("palidrom");
				break;
			}else{
				System.out.println("not");
				break;
			}
		}
		sc.close();		
	}
}
