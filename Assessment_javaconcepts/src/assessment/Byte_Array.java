package assessment;

import java.util.ArrayList;
import java.util.TreeSet;

public class Byte_Array {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(40);
		l1.add(60);
		l1.add(50);

TreeSet t1=new TreeSet(l1);
byte[]arr=new byte[l1.size()];
for(int i=0;i<l1.size();i++){
	arr[i]=(byte)(int)l1.get(i);
	System.out.println(arr[i]);
}
//for(Object o1:l1){
//	System.out.println(o1);
//}





	}

}
