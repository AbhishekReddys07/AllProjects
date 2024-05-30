package ds;

public class Recursion_sum10to1 {
	static byte sum;
 static int a=0;
	public static void main(String[] args) {
		mu(10);
		System.out.println(sum);
		System.out.println(a);
	}

	static void mu(int num) {

		if (num >= 1) {
			if(num%2!=0){
			sum += num;
			}
			mu(num - 1);
		}

		//System.out.println(sum);
		a++;
	}

	// this logic is for return type
	// if(num==1)
	// return 1;
	// return num+mu(num-1);

}
