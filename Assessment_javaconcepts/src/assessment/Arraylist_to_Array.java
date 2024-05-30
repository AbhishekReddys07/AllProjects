package assessment;

import java.util.ArrayList;
import java.util.TreeSet;

//Write a program to convert ArrayList to integer array
public class Arraylist_to_Array {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(40);
		l1.add(60);
		l1.add(50);
		int[]arr=new int[l1.size()];
		for(int i=0;i<l1.size();i++){
			arr[i]=l1.get(i);
		
		//System.out.println(arr[i]);
		}
		TreeSet<Integer> t1=new TreeSet<Integer>(l1);
		for(Object o1:t1){
			System.out.println(o1);
		}
	}

}
