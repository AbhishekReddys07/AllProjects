package event2;

import java.util.*;

public class Event_test2 {

	public static void main(String[] args) throws InterruptedException {
	PriorityQueue l1= new PriorityQueue();
      l1.add("Bangalore");
      l1.add("Mysore");
      l1.add("Tumkur");
      l1.add("Mandya");
      l1.add("Ramnagar");
      l1.add("Madikeri");
      l1.add("kolar");
      l1.add("Hassan");
      l1.add("Gadag");
     // System.out.println(l1);
      PriorityQueue state1=new PriorityQueue();
      state1.add("Karnataka");
      state1.add("Goa");
      state1.add("Assam");
      state1.add("Tamilnadu");
      state1.add("rajastan");
      state1.add("Gujarat");
      state1.add("Kerala");
      state1.add("Maniupur");
      
     if(l1.contains("Mysore")){
     	//System.out.println(l1.poll());
     }
  	if(state1.contains("Delhi")){}
  	else{
  			state1.add("Delhi");
  		}
  	
  		ArrayList a1=new ArrayList();
  		a1.addAll(l1);
  		a1.addAll(state1);
  		for(int i=a1.size()-1;i>=0;i--){
  		System.out.println(a1.get(i));}
  		if(state1.contains("Kerala")){
  			System.out.println(l1);
  		}
  		
  	
}
 	
 }

