import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		String a=sc.next();
		sc.close();
		int ans=0;
		for(int i=0;i<a.length();i++){
			int count=0;
			switch(a.charAt(i)){
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'h':
			case 'g':
			case 'e':
			case 'f':
			case 'i':
				count=1;
				break;
			case 'j':
			case 'o':
			case 'p':
			case 'k':
			case 'm':
			case 'n':
			case 'q':
			case 'l':
			//case 'z':
				count=2;
				break;
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'z':
			case 'w':
			case 'x':
			case 'y':
				count=3;
				break;
			}
			ans+=count;
			}
		System.out.println(ans);

	}
}
