package programs;
import java.util.*;
public class Palindrome_num {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int rev=0;
		int cop=no;
		while(no!=0){
			int a=no%10;
			rev=(rev*10)+a;
			no=no/10;
		}
		if(cop==rev){
			System.out.println("pali");
		}else{
			System.out.println("not pali");
		}
	sc.close();}

}
