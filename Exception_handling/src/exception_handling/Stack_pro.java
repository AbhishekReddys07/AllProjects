package exception_handling;
class Sample{
	static void disp3() 
	{
		int nu=1/0;
		System.out.println(nu);
	}
	static void disp2()
	{
		disp3();
	}
	static void disp1()
	{
		disp2();
	}
}
public class Stack_pro {

	public static void main(String[] args) {
		System.out.println("*****main starts*****");
		try{
			Sample.disp1();
		}
		catch(ArithmeticException e){
			int nu=23/2;
			System.out.println(nu);
		}
		System.out.println("*****main ends*****");
	}

}
