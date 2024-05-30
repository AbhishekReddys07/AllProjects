package pratice_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Arryalist_to_array {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
		System.out.println("a number");
		l.add(sc.nextInt());
		System.out.println("2 number");
		l.add(sc.nextInt());
		System.out.println("3 number");
		l.add(sc.nextInt());
	//	l.add(sc.nextInt());
		
		int[]arr={l.size()};
		for (int i = 0; i < l.size(); i++) {
			arr[i]=(int)l.get(i);
		System.out.println(arr[i]);
		}
	}
}
