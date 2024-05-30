import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		while(num>9){
			int sum=0;
			do{
				int f=num%10;
				sum=sum+(f*f);
				num=num/10;
			}
			while(num!=0);
			num=sum;
			//System.out.println(num);
			//break;
		}
		   if(num==1 || num==7){
		    	  System.out.println("happy number");
		      }
		      else{
		    	  System.out.println("Not happy number");
		      }
sc.close();
	}

}
