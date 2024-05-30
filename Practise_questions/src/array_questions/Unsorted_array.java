package array_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Unsorted_array {
	// question:-sort user define array without using inbuilt methods
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter" + "\t" + i + " " + "array elements");
			arr[i] = sc.nextInt();
		}
		int[] ans = unsorted(arr);
		System.out.println("sorted" + Arrays.toString(ans));
		// System.out.println("sorted\t"+Arrays.toString(ans));
		sc.close();
	}

	static int[] unsorted(int[] arr) {
		// int[] an = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
			// for (int k = 0; k < arr.length; k++) {
			// System.out.println(arr[k]);
			// }

		}
		return arr;
	}

}
