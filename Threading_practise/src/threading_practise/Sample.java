package threading_practise;

public class Sample extends Thread {
	public static void main(String[] args) {
		Test t=new Test();

		
	}

}
class Test extends Thread{
	void sam(){
		System.out.println("hello");
		
	}
	Thread t1=new Thread();
	t1.start();
	
}
