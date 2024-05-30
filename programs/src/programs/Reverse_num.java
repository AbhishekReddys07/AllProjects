package programs;
import java.util.*;
public class Reverse_num {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int rev=0;
		while(no!=0){
			int a=no%10;
			rev=(rev*10)+a;
			no=no/10;
		}
		System.out.println(rev);
	sc.close();}

}
