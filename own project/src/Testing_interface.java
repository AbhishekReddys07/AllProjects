abstract class Sample{
	 void whatsapp(){
		 System.out.println("Hii");
	 }
}
class user1 extends Sample{
	public void whatsapp(){
	//	super.whatsapp();
		System.out.println("user1");
	}
}
class user2  extends Sample{
  public user2(Sample s) {
	 // s.whatsapp();
}
 public void whatsapp(){	  
	  System.out.println("user2");
  }

}
class user3 extends Sample{
	
	  public user3(Sample s) {
			 //s.whatsapp();
		}
	public void whatsapp()
	{
		System.out.println("user3");
	}
}

public class Testing_interface {

	public static void main(String[] args) {
		
		Sample s=new user1();
		s.whatsapp();
	  new user2(s).whatsapp();
	  new user3(s).whatsapp();	  
	 
	
	
	}
}
