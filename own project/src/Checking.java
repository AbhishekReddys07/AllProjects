import java.util.Scanner;

class Sampl{
	void mu(String na){
		String n=na;
		String re="";
		for(int i=n.length()-1;i>0;i--){
			re=re+n.charAt(i);
		}
		System.out.println(re);
	}
}
public class Checking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.nextLine();
	new Sampl().mu(name);
		
sc.close();
	}

}
