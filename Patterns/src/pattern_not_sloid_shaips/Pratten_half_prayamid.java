package pattern_not_sloid_shaips;

public class Pratten_half_prayamid {
	
	public static void main(String[] args) {
		int n=10;
		for (int i =1; i <= n; i++) {
			for (int j =1; j <= n; j++){
				if(j==1||i==n||i==j){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
				System.out.println();
		}
	}

}
