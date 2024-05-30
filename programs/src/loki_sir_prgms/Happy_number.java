package loki_sir_prgms;

import java.util.Scanner;

public class Happy_number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number to check your Happy Number ");
	int num=sc.nextInt();
	int sum;
	while(num>9){
		sum=0;
		do{
			int d=num%10;
			sum=sum+d*d;
			num=num/10;
		}
		while(num!=0);
			num=sum;
	    }
	if(num==1||num==7){
		System.out.println("Happy Number");
	}
	else{
		System.out.println("Not Happy Number");
	}
	sc.close();
	}

}
