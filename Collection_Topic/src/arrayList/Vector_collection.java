package arrayList;

import java.util.Vector;

public class Vector_collection {

	public static void main(String[] args) {
	Vector v1=new Vector();
	//int priv=v1.hashCode();
	v1.add("Hello");
	v1.add("Abhishek");
	v1.add("Reddy");
	System.out.println(v1);
	//int priv=v1.hashCode();
    for(int i=0;i<=v1.size()-1;i++){
    	System.out.println(v1.get(i));
    	
    }
	
	}

}
