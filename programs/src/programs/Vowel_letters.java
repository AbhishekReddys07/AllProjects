package programs;
import java.util.*;
public class Vowel_letters {

	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc=new Scanner(System.in);
		String na=sc.nextLine();
		String lo=na.toLowerCase();	
		sc.close();
		int count=0;
		int consonant=0;
		for(int j=0;j<lo.length();j++){
			char ch=lo.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
			else{
				consonant++;
			}
		}
		System.out.println("Number of vowels ->"+count);
		System.out.println("number of consonant ->"+consonant);
		
	}
}

//	private static char rev(int j) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
