package pattern_not_sloid_shaips;

public class Pratten_form_middle {
 
	public static void main(String[] args) {
		int n=30;
		for (int i =1; i <= n; i++) {
			for (int j =1; j <= n; j++){
				if(j==n/2+1||i==n/2+1 ||i==j||i+j==n+1){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
