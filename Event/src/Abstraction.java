interface Sample{
	void teacher();
}

class St implements Sample{
	public void teacher(){
     System.out.println("hello");
	}
}
class St1 implements Sample{
	public void teacher(){
		System.out.println("hii");
	}
}
class St2 implements Sample{
	 public void teacher(){
		System.out.println("heeee");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		St s1=new St();
		St1 s2=new St1();
		St2 s3=new St2();
		s1.teacher();
		s2.teacher();
		s3.teacher();
	}

}
