package arrayList;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(1234);
		l1.add("abhi");
		l1.add(554.99);
		System.out.println(l1);
		for(int i=0;i<=l1.size();i++){
			System.out.println(l1.poll());
		
		}	System.out.println(l1);

	}

}
