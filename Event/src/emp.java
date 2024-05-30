class Sample33{
	String name;
	int id;
	char grade;
	Sample33(String name,int id,char grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
//	public String toString(){
//		return name+" "+id+" "+grade;
//	}
}
public class emp {
public static void main(String[] args) {
	Sample33 s1=new Sample33("abhi",10,'A');
	System.out.println(s1.name);
	System.out.println(s1.id);
	System.out.println(s1.grade);
	System.out.println(s1);
}
}
