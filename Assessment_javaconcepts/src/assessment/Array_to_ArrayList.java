package assessment;

import java.util.ArrayList;

public class Array_to_ArrayList {

	public static void main(String[] args) {
		short[]arr={10,20,30,40,50};
		ArrayList<Integer> l1=new ArrayList<Integer>(5);
		for(int i=0;i<arr.length;i++){
			l1.add((int)(int) (arr[i]));
			System.out.println(l1.get(i));
			
		}

	}

}
