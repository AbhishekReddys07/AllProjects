import java.util.Scanner;

public class Project1 {

 static void  A(){
   System.out.println("GOOD LIFE");
	 }
 static void  AB(){
	   System.out.println("Good life and litte lack of consentrastion ");
		 }
 static void AC(){
	 System.out.println("Enjoy Love Life 100%");
 }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name for prediction");
	String str=sc.nextLine();
	String s=str.toLowerCase();
	for(int i=1;i<=s.length()-1;i++){
		char a=s.charAt(i);
		if(a=='a'&& s.endsWith("a")){
			A();
		}
	   if(a=='a' && s.endsWith("b")==true){
			AB();
		}
		if(a=='a' && s.endsWith("c")){
			AC();
		}
		
		if(a!='a'){
		for(int j=0;j<=s.length();j++){
			char c=s.charAt(j);
		 //  System.out.println(c);
		
		}
		}
	}
	
      
      
      
      
      
	
	
	
sc.close();
}

}
