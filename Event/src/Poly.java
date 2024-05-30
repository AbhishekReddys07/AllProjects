class school{
	void teacher(){
		System.out.println("school");
	}
}
class Student extends school{
	void teacher(){
     System.out.println("std");
	}
}
class Student1 extends school{
	void teacher(){
		System.out.println("std1");
	}
}
class Student2 extends school{
	void teacher(){
		System.out.println("std2");
	}
}
class Stt{
	static void All(school s){
		s.teacher();
	}
}
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s=new Student();
		 Student1 ss=new Student1();
		 Student2 s2=new Student2();
		 Stt.All(s);
		 Stt.All(ss);
		 Stt.All(s2);
	}

}
