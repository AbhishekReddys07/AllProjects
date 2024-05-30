package programs;
import java.util.*;

public class Fibonacci_series {

	public static void main(String[] args){
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		int f1=0;
		int f2=sc.nextInt();
		int f3=0;
		for(int i=0;i<=5;i++){
		 f3=f1+f2;
		 System.out.println(f3+" ");
		 f1=f2;
		 f2=f3;
		}
		 System.out.println(f3+" ");
		 sc.close();
		 }
}
