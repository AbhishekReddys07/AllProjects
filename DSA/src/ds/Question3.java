package ds;

import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(mu(num));
	sc.close();
}

private static int mu(int num) {
	if(num!=0){
		if(num%2==0){
			return num+mu(num-2);
		}
		else{
			return mu(num-1);		}
	}
	return num;
}
}
