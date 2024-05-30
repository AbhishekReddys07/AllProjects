package programs;

public class Counting_space {

	public static void main(String[] args) {
		char ch=' ';
		int count=0;
		String na="hey my name is abhishek";
		for(int i=1;i<na.length();i++){
            ch=na.charAt(i);
            //System.out.println("the given space is ->"+count);
		if(ch==' '){
		 count++;
		 System.out.println("the given space is ->"+count);
		}
//		else{
//			System.out.println();
//		    
//		}
		}
		//System.out.println("the given space is ->"+count);
		//System.out.println(count);
	}
}
