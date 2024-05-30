package assessment;
import java.util.ArrayList;

public class Short_converstion {

	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(50);
		l1.add(40);
		l1.add(60);
       short[]arr=new short[(l1.size())];
       for(int i=0;i<l1.size();i++){
    	   arr[i]=(short)(byte)(int)l1.get(i);
    	    System.out.println(arr[i]);
    	    
       }
	}

}
