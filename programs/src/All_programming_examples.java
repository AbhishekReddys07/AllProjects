import java.util.Scanner;

public class All_programming_examples {
	//factorial numbers
static void factorial(int num){
	long fact=1;
	for(int i=num;i>=1;i--){
		fact=fact*i;
		System.out.println(i+"*");
		
	}
	System.out.println(fact);
}
	public static void main(String[] args) {
//		System.out.println("enter num");
//		Scanner sc=new Scanner(System.in);
//		int no=sc.nextInt();
//		//int num=sc.nextInt();
//		factorial(no);
		fibanacci();
		swap();
	}
   static void fibanacci(){
	   int f1=0;
	   int f2=1;
	   int f3=0;
	   //System.out.println(f1+" "+f2);
	   for(int i=0;i<=5;i++){
		  f3=f1+f2;
		  f1=f2;
		  f2=f3;
	   }
	   System.out.println(f3);
   }
   static void swap(){
	int a=1;
	int b=2;
	int c=0;
	
	a=b;
	b=a;
	c=b;
		
	System.out.println(a+" "+b);
}
   
   
   
   
   
}
