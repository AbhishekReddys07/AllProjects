package programs;

interface Sample{
	void disp();
	void dis();
}
interface Sample2 extends Sample{
	void disp1();
}
class Sample3 implements Sample2{
	public void disp1(){
		System.err.println("disp1");
	}
	public void disp(){
		System.err.println("disp");
	}
  public void dis(){
		System.err.println("dis");
	}
}

public class Multiplication {
	
 public static void main(String[] args) {
  Sample3 s1=new Sample3();
    s1.dis();
	s1.disp();
	s1.disp1();		
		}
 }
 

       
     