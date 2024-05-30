package ds;

public class Recursion_sum1too10 {
static int sum;
	public static void main(String[] args) {
		mu(1);
		System.out.println(sum);
	}

	 static void mu(int num) {
		 if(num<=10){
			 if(num%2==0){
			 sum+=num;
			 }
			 mu(num+1);
		 }
		
	}

}
