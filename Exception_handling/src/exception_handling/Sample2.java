package exception_handling;

import java.util.Scanner;

public class Sample2 {
public static void main(String[] args) {
	int []arr={1234};
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	
	int num=a;

	try{
	System.out.println(arr[num]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Give a proper input number");
		int b=sc.nextInt();
		System.out.println(arr[b]);
		if(count>3){
			System.out.println("colse Application");
		}
		//count++;
		}
	finally{
		System.out.println("close");
		 count++;
	}

//System.out.println(count); 
sc.close();
}
}

