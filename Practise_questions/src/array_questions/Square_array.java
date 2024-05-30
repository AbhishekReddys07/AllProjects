package array_questions;

import java.util.Scanner;

public class Square_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[]arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("array"+i+"elements");
		arr[i]=sc.nextInt();
		}
		int n=squae(arr);
	sc.close();	
	}

	private static int squae(int []arr) {
		
		int[] an=new int[arr.length];
		int tem;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			tem=arr[i];
			//System.out.println(an[i]);
			int squa=2;
			while(tem!=0){
				 ans=tem*squa;
			System.out.println("square of each input"+ i +"\t"+ans);
			break;
			}
			
			//System.out.println(ans);
		}
		return ans;
		
		
	}
//	static int square(int t){
//		int squa=2;
//		while(t!=0){
//			int ans=t*squa;
//		}
//		return t;
//	
//	}
}
