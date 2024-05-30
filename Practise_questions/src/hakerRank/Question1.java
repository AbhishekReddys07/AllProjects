package hakerRank;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = "";
		//int n=0;
		for (int i = 0; i < 2; i++) {
			System.out.println("enter string");
			str = sc.next();
			System.out.println("enter number");
			int x = sc.nextInt();
			if(str.length()-1<=4 && (x>0 && x<=100) || str.length()-1<=3 && (x>0 && x<100)){
				int a=9;
				while(a!=0){
					str=str+" ";	
					a--;
					//System.out.println(str);
					
				}
				int t=0;
				if(x<99){
				 t+=0+x;
				}
				
				System.out.println(str+"0"+t);
				
			}
		}
//		System.out.println(str);

//		for (int j = 0; j <= str.length(); j++) {
//			ss = ss + str.charAt(j);
//		}
//		System.out.println(ss);
		sc.close();
	}
}
