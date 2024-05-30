package arrayList;
import java.util.Vector;

public class Vector_class {

	public static void main(String[] args) {
      Vector<String> v1=new Vector<String>(4);
	  v1.add("Abhishek reddy s -> C");
	  v1.add("venkat -> Akka");
	  v1.add("Dhananjya -> Purple");
	  v1.add("Raashid -> kiruik");
	// System.out.println(v1);
	 for(int i=0;i<v1.size();i++){
		 System.out.println(v1.get(i));
	 }
	}

}
