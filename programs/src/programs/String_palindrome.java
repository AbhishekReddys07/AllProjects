package programs;
import java.util.*;

public class String_palindrome {

	public static void main(String[] args) {
		System.out.println("enter Your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--){
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	sc.close();}

}
