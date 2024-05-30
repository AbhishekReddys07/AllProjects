package arrayList;
import java.util.ArrayList;


public class Arraylist {

	public static void main(String[] args) {
    new Sample().disp();
    new Sample1().test();
    new Sample2().demo();
	}
	

}
class Sample {
	void disp(){
		ArrayList<Object> l1=new ArrayList<>();
		l1.add(77);
		l1.add("abhishek");
		System.out.println(l1);
		ArrayList<Object> l2=new ArrayList<>();
	     l2.add(77);
	     l2.add("C");
	     System.out.println(l2.contains(l1));
       l2.removeAll(l1);		
		System.out.println(l2);
	
		
	}
}
class Sample1{
	void test(){
		ArrayList l1=new ArrayList();
		l1.add(77);
		l1.add("abhishek");
		System.out.println(l1);
		ArrayList l2=new ArrayList();
	     l2.add(77);
	     l2.add("C");
	     System.out.println(l2);
       l2.retainAll(l1);		
		System.out.println(l2);
		for(int i=0;i<l2.size();i++){
			System.out.println(l1.get(i));
		}
		
	}
}
class Sample2{
	void demo(){
		ArrayList l1=new ArrayList();
		l1.add(77);
		l1.add("abhishek");
		System.out.println(l1);
		ArrayList l2=new ArrayList();
	     l2.add(77);
	     l2.add("C");
	     System.out.println(l2);
       l2.contains(l1);		
		System.out.println(l2);
		if(l2.contains(l1)){
			System.out.println("its presents");
		}else{
			System.out.println("not present");
		}
		
	}
}