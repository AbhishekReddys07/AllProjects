class encap{
	private int a=77;
	public int geta(){
		return a;
	}
	public void seta(int a){
		this.a=a;
		System.out.println(a);
	}
}

public class encapu {
   
	public static void main(String[] args) {
	         encap e1=new encap();
			//e1.seta(78);
			System.out.println(e1.geta());
			

		}
}
