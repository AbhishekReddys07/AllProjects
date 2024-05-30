package exception_handling;



public class Sample1 {

public static void main(String[] args) {
	try{
	int ac=10/0;
	System.out.println(ac);
	}
	catch(ArithmeticException e){
		System.out.println("heheh");
	}
	int []arr={1,2,3,4,5};
	try{
	System.out.println(arr[4]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("gandu");
	}
}
}
