class Sample1{
	void dis(int a){
		System.out.println(a);
	}
	void dis(String a){
		System.out.println(a);
	}
	void dis(char a){
		System.out.println(a);
	}
	void dis(String a,int b){
		System.out.println(a+" "+b);
	}
	void dis(int a,char b){
		System.out.println(a+" "+b);
	}
	void dis(int a,String b){
		System.out.println(a+" "+b);
	}
}
public class method_overlo {
  public static void main(String[] args) {
	Sample1 s1=new Sample1();
	s1.dis('a');
	
}
}
