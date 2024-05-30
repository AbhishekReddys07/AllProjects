package programs_questions;

import java.util.Scanner;

public class Nith_equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("cse1001 marks");
		int cse1001 = sc.nextInt();
		System.out.println("cse2014 marks");
		int cse2014 = sc.nextInt();
		System.out.println("math marks");
		int math = sc.nextInt();
		int pm = 20;
		int sum;  
		int t = 0;
		if (cse1001 >= pm && cse2014 >= pm && math >= pm) {
			sum = cse1001 + cse2014 + math;
			System.out.println("Total marks is->" + sum);
		} else if (cse1001 <= pm || cse2014 <= pm || math <= pm) {
			int f = cse1001 + cse2014 + math;
			System.out.println("Total after failing in subjects" + f);
		}
		if (cse1001 < pm) {
			System.out.println("fail in cse1001 subject");
		} else if (cse1001 >= pm) {
			t += cse1001;
		}
		if (cse2014 < pm) {
			System.out.println("fail in cse2014 subject");
		} else if (cse2014 >= pm) {
			t += cse2014;
		}
		if (math < pm) {
			System.out.println("fail in math subject");
		} else if (math >= pm) {
			t += math;
		}
		int n = 135;
		if (n >= 150 || t>=n) {
			System.out.println("Grade is->" + "A+");
		} else if (t > 100 && t <= 135) {
			System.out.println("Grade is->" + "A");
		} else if (t >= 80 && t <= 100) {
			System.out.println("Grade is->" + "B+");
		} else if (t >= 55 && t <= 80) {
			System.out.println("Grade is->" + "B");
		} else if (t == 60) {
			System.out.println("Grade is->" + "C");
		} else {
			System.out.println("Grade is->" + "D");
		}
		sc.close();
	}
}
