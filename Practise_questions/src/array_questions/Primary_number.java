package array_questions;

import java.util.Scanner;

public class Primary_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		if (size >= 3) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("array" + i + "elements");
				arr[i] = sc.nextInt();
			}
		} else {
			System.out.println("entered array size should be greater that or equal 3");
		}
		sc.close();
		boolean b = prime(arr);
		System.out.println(b);
	}

	private static boolean prime(int[] arr) {
		boolean flag = true;
		int count = 0;
		int tem;
		for (int i = 0; i < arr.length; i++) {
			tem = arr[i];
			while (tem != 0) {
				int an = tem % 10;
				if (an / 1 == 1 && i % 2 == 0) {
					flag = true;
					System.out.println(
							"This is entered value" + " " + arr[i] + " and checking for primary number-> " + flag);
					count++;
					break;
				} else
					flag = false;
				System.out.println(
						"This is entered valuer" + " " + arr[i] + "  and checking for primary number->-> " + false);
				tem = tem / 10;
			}
		}
		if (count >= 3) {
			return flag = true;
		} else {
			return flag = false;
		}
	}
}
