package programs;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int copy=no;
	    int sum=0;
	    //int fact=1;
	    while(no!=0){
	    	int d=no%10;
	    	int n=d;
	    	int fact=1;
	    	sc.close();
	    	for(int i=n;i>=1;i--){
	    		fact=fact*i;
	    	}
	    	sum=sum+fact;
	    	no=no/10;
	    }
	    if(copy==sum){
	    	System.out.println("Strong Number");
	    }else{
	    	System.out.println("Not Strong Number");
	    }

	}

}
