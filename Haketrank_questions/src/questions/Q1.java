package questions;



public class Q1 {
	public static void main(String[] args) {
    System.out.println(def(8,12));
	}
   private static int def(int i, int j) {
	   int a;
	   int b;
	   int c;
		if(i==0){
			return j;
		}else{
			 a=i-1;
			 b=a+j;
			 c=a+b;
		}
			
			
			
		return c;
		
				
		
	}

   
}
