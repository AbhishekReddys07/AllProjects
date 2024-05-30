interface Sample{
    void sam();
}
class Sam implements Sample{
	public void sam(){
		System.out.println("jhhhhh");
	}
}
class Samm implements Sample{
	public void sam(){
		//super.sam();
		System.out.println("hhhhhh");
	}
}
class A extends  Sam
{
	void s(Samm s){
		//super.sam();
	    //super.sam();
		s.sam();
		System.out.println("aaaaaa");
	}
}

public class Infosys {

	public static void main(String[] args) {
     Sample a1= new A();
     a1.sam();
     
	}

}
