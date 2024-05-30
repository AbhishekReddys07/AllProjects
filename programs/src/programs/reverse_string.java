package programs;

import java.util.*;

public class reverse_string {
	static int uppercase;
	 static int Lowercase;
	 static int num;
	static int special;
	public static void main(String[] args) {
		// String str = "500";
		//
		// for (int i = str.length()-1; i >=0; i--) {
		// char c=str.charAt(i);
		// if(c=='5'){
		// System.out.println("true");
		// }else{
		// System.out.println("false");
		// }
		// }
		// System.out.println(str.contains("5"));
		int a = 0;

		//
		// for (int i = 1; i <= 5; i++) {
		// reverse_string r=new reverse_string();
		// System.out.println(r.hashCode());
		//
		// }
		
//		do {
//			reverse_string r = new reverse_string();
//			System.out.println(r.hashCode());
//			a++;
//		} while (a < 5);
		
String name="bhi12#";
int count=0;
int ans = 0;	
			char c;
			for (int i = 0; i <name.length()-1; i++) {
				
				c=name.charAt(i);
				if((c>=45&c<=90)){
		//System.out.print(c);
					uppercase++;
					System.out.println(uppercase);
					//ans++;
					//System.out.print(ans);
				}
//				else if((c>=97)&&(c<=123)){
//					//System.out.print(c);
//					Lowercase++;
//					ans+=Lowercase;
//				}
//				else if((c>=31)&&(c<=39)){
//					//System.out.print(c);
//					num++;
//					ans+=num;
//				}
//				else if((c>=20)&&(c<=27)){
//				//	System.out.print(c);
//					special++;
//					ans+=special;
//				}
				
			}
//			ans+=uppercase;
//			
//			System.out.println(ans);
			
		
		
}
	
}
