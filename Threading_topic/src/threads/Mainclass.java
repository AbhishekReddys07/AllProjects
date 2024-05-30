package threads;

class Resource{
	synchronized void mu(){
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	synchronized void muu(){
		for (int j = 11; j <=20; j++) {
		System.out.println(j);
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	}
}
  class Sample extends Thread{
	Resource mu1;
	Sample(Resource mu1){
		this.mu1=mu1;
	}
	public void run(){
		mu1.mu();
	}
}
class demo extends Thread{
	Resource mu2;
	demo(Resource mu2){
		this.mu2=mu2;
	}
	public void run(){
		mu2.muu();
	}
}
public class Mainclass {

	public static void main(String[] args) {
    Resource r=new Resource();
    Sample s1=new Sample(r);
    Thread t1=new Thread(s1);
    t1.run();
 
    demo d1=new demo(r);
    Thread t2=new Thread(d1);
    t2.start();
    
		

	}

}
