import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  ArrayList l1=new ArrayList();
	  System.out.println("enter value 1");
	 l1.add(sc.next());
	  System.out.println("enter value 2");
	 l1.add(sc.next());
	  System.out.println("enter value 3");
	 l1.add(sc.next());
	 
	 TreeSet t1=new TreeSet();
     String []arr=new String[(l1.size())];
//	 }
	 for(int i=0;i<arr.length;i++){
		 String s=arr[i];
		 char []ch=s.toCharArray();
		 String str="";
		 Arrays.sort(ch);
		 for(int j=0;j<ch.length;j++){
			 str+=ch[j];

		 }
		 //System.out.println(str);
	 }
	// System.out.println(t1);
	 
	 
	 
	 
	 
	 
	 
	 
//	  TreeSet t1=new TreeSet();
//	  System.out.println(t1);
	}

}
//for(int i=0;i<=arr.length;i++){
//	  System.out.println("Enter values");
//	  try{
//arr[i]=sc.next();
//	  }
//	  catch(ArrayIndexOutOfBoundsException e){
//		  System.out.println("");
//	  }