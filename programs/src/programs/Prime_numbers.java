package programs;
import java.util.*;
public class Prime_numbers {

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		//int n=no;
		int count=0;
		boolean f=true;
		sc.close();
		for(int i=2;i<=no;i++){
     if(no%i==0){
			f=false;
			break;
     }
		if(f==true){
			System.out.println("prime no");
			count++;
			System.out.println(count);
		}
		if(f==false){
			System.out.println("not prime");
		}
		}
		
	}

}
