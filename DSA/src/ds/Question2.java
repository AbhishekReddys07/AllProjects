package ds;

import java.util.Scanner;

public class Question2 {
 static int even;
 static int odd;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		mu(num);
		System.out.println(even+"\n"+odd);
	}

	private static void mu(int num) {
		if(num!=0){
			if(num%2==0){
				even+=num;
				mu(num-1);
			}else{
				odd+=num;
				mu(num-1);
				
			}
			
			
		}
		
	}
}
