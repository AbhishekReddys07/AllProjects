package arrayList;

import java.util.PriorityQueue;

public class priority_queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(81);
		p1.add(77);
		//System.out.println(p1);
		PriorityQueue<Integer> p2=new PriorityQueue<Integer>();
		p2.add(76);
		p2.add(77);
		p2.add(65);
		p2.add(95);
	//	System.out.println(p2);
		p1.removeAll(p2);//to remove duplicate values from p1 compares with p2
		p1.addAll(p2);//adding all elements to p1 from p2
		System.out.println(p1);
		for(int i=0;i<=p2.size();i++){
			
		   System.out.println(p1.poll());
		   System.out.println(p1);
		   
		}
		muu();
	}
     static void muu(){
    	 PriorityQueue<String> p1=new PriorityQueue<String>(10);
    	 p1.add("Abhishek ");
    	 p1.add("Reddy");
    	 p1.add("s");
    	 p1.add("from INDIA");
    	 p1.add("hiihih");
    	 
    	 for(Object o1:p1){
    		 System.out.print(o1+" ");
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
