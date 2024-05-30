package ds;

public class Recursion {

	static void mu(int num){
		if(num==1){
			System.out.println("hello");
		}
		else{
			if(num%2==0){
				System.out.println(num);
			}
			mu(num-1);
		}
	}
	public static void main(String[] args) {
		mu(10);
	}
}
