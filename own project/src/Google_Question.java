import java.util.Scanner;

public class Google_Question {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String pass=sc.nextLine();
		int ucount=0;
		int lcount=0;
		int ncount=0;
		int scount=0;
		if(pass.length()>=8){
		for(int i=0;i<=pass.length();i++){
			char ch=pass.charAt(i);
			if(ch>='A' && ch<='Z')
				ucount++;
			if(ch>='a' && ch<='z')
				lcount++;
			if(ch>='0' && ch<='9')
				ncount++;
			else{
				scount++;
			}
			if(ucount>=1||lcount>=1||ncount>=1||scount>=1||pass.endsWith("#")){
				System.out.println("Logging Successfully");
				break;
			}
			else{
				System.out.println("Invalid Input");
				break;
			}
			}
		}
			else{
				System.out.println("invalid");
				//break;
			}
			sc.close();
		
		
		
		
		
	}
}
