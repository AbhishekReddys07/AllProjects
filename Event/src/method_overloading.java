class Sample2{
	void disk(){
		System.out.println("hoooo");
	}
}
class Sample3 extends Sample2{
	void disk(){
		super.disk();
		System.out.println("heeeee");
	}
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 s1= new Sample3();
		  s1.disk();

	}

}
