package pratice;

public class Question_1 {
	public static void main(String[] args) {
		//find the sum of these five number without using arrays[]  
		int num=12345;
		int sum=0;
		while(num!=0){
			int d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println(sum);
	}

}
