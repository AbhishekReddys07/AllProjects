import java.util.Scanner;

public class Strong_num_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		int fact=1;
		int copy=num;
		while(num!=0){
			int no=num%10;
			int n=no;
			for(int i=n;i>=1;i--){
				fact=fact*i;
				sum=sum+fact;
				num=num/10;
				System.out.println(sum);
			}
		}
		if(copy==sum){
			System.out.println("Strong number");
		}
		else{
			System.out.println("not strong num");
		}

	}

}
