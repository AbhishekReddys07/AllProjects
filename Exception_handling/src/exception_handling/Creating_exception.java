package exception_handling;

import java.util.Scanner;

public class Creating_exception {
    static void shaddi(int age) throws ageexception{
 
    	if(age>18){
    		System.out.println("Enter");
    	}
    	else{
    		throw new ageexception("Kindly recheck your Age");
    	}
    	    }
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter your Age");
    	int age =sc.nextInt();
    	sc.close();
    	try{
    	shaddi(age);
    	}
    	catch(ageexception e){
    		System.out.println(e.getage());
    	}
    }
}
class ageexception extends Exception{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String age;
	ageexception(String age){
		this.age=age;
	}
	
	public String getage(){
		
		return age;
	}
}
