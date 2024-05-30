package pattern;

public class Letter_c {

	public static void main(String[] args) throws InterruptedException {
		int n=10;
	for(int i=1;i<=n;i++){
		for(int a=1;a<=n;a++){
			if(i==1 || i==n || a==1){
				Thread.sleep(500);
				System.out.print("*");
			}
		}
		System.out.println();
	}
	}

}
