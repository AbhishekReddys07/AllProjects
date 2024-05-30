import java.util.Scanner;

class Orginal 
{
	
	public void pas(String a)
	{
		//String pas=a;
	    String rev="";
	    for(int i=a.length()-1;i>=0;i--){
	    	try{
	    	rev=rev+a.charAt(i);
	    	}
	    	catch(StringIndexOutOfBoundsException e){
	    		rev=rev+a.charAt(i);
	    	}
	    }
	    System.out.println(rev);
	if(rev.equals(a)){
		System.out.println("enter");
	}else{
		System.out.println("password not corret");
	}
  }
}
public class Project_1 {

	public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	//String p=a;
	Orginal o1=new Orginal ();
	o1.pas(a);
	sc.close();
	
	}
}
