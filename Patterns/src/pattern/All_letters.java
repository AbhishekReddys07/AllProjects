package pattern;

//import com.sun.jmx.snmp.tasks.ThreadService;

class mul_let{
	static void A() throws InterruptedException{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n/2+1||j==1||j==n){
					Thread.sleep(100);
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	
	static void b() throws InterruptedException{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n/2+1||i==n||j==1||j==n){
					Thread.sleep(100);
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	static void c() throws InterruptedException{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 ||j==1||i==n){
					Thread.sleep(100);
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
static void d() throws InterruptedException{
	int n=5;
	for(int i=1;i<=4;i++){
		for(int j=1;j<=n;j++){
			if(j==2||i==1||i==4||j==n){
				Thread.sleep(100);
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
	/* if(j==1||((i==1||i==n)&&j<=n-1){
	 * Sop("*");
	 * else if(i!=1&&1!=n&&j==n){
	 * sop("*");
	 * }else{
	 * Sop(" ");}
      }  */
}
static void e() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||i==n/2+1||i==5||j==1){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();	
	}
}
static void f() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||i==1||i==n/2+1){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void g() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||i==1||i==n||(i>n/2&&j==n)||(i==(n/2+1)&&j>n/2)){
			  Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void h() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||j==n||i==n/2+1){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void i() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==n/2+1||i==1||i==n){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void j() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||(i==n&&j<=n/2+1)||j==n/2+1){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void k() throws InterruptedException{
	int n=5;
	int x=n/2+1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n/2+1;j++){
			if(j==1||j==x){
				Thread.sleep(100);
				System.out.print("* ");
			}else{
				System.out.print(" ");
			}
		}
			if(i<=n/2){
				x--;
			}
			else{
				x++;
			}
	System.out.println();
	}
}
static void l() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||i==n){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void m() throws InterruptedException{
	int n=5;
    int x=1;
    for(int i=1;i<=n;i++){
    	for(int j=1;j<=n;j++){
    		if(j==1||j==n||((j==x||j==n-x+1)&&i<=n/2+1)){
    			Thread.sleep(100);
    			System.out.print("*");
    		}else{
    			System.out.print(" ");
    		}
    	}
    	x++;
    	System.out.println();
    }
}
static void n() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||j==n||i==j){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void o() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||i==1||j==n||i==n){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void p() throws InterruptedException{
	int n=5;
	int x=(n/2)+1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if((i==1&&j<=x)||j==1||(j==x&&i<=x)||(i==x&&j<=x)){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void q() throws InterruptedException{
	int n=7;
	int x=n-n/2+1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(((i==1||i==x+1)&&j<=x+1)||((j==1||j==x+1)&&i<=x+1)){
				Thread.sleep(100);
				System.out.print("*");
			}else if(j==i&&i>=x){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void r() throws InterruptedException{
	int n=7;
	int x=1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n/2+1;j++){
			if(j==1||i==1||i==n/2+1||(i<=n/2&&j==n/2+1)||j==x){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
		if(i>n/2){
			x++;
		}
	System.out.println();
	}
}
static void s() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||i==n||i==n/2+1||(j==1&&i<=n/2+1)||(j==n&&i>n/2+1)){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void t() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||j==n/2+1){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void u() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==n||j==1||j==n){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void v() throws InterruptedException{
	int n=5;
	int x=1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<2*n;j++){
			if(j==x||j==2*n-x){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	x++;
	}
}
static void w() throws InterruptedException{
	int n=5;
	int x=n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<2*n;j++){
			if(j==1||j==2*n-1||j==x||j==2*n-x){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	x--;
	}
}
static void x() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==i||j==n-i+1){
				Thread.sleep(100);
				System.out.print("* ");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void y() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if((j==i||j==n-i+1)&&i<=n/2+1||(j==n/2+1&&i>n/2)){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
static void z() throws InterruptedException{
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||i==n||j==n-i+1){
				Thread.sleep(100);
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}

}
public class All_letters {

	public static void main(String[] args) throws InterruptedException {
	mul_let.A();
	System.out.println("****************************************");
	mul_let.b();
	System.out.println("****************************************");
	mul_let.c();
	System.out.println("****************************************");
	mul_let.d();
	System.out.println("****************************************");
	mul_let.e();
	System.out.println("****************************************");
    mul_let.f();
    System.out.println("****************************************");
    mul_let.g();
    System.out.println("****************************************");
    mul_let.h();
    System.out.println("****************************************");
    mul_let.i();
    System.out.println("****************************************");
    mul_let.j();
    System.out.println("****************************************");
    mul_let.k();
    System.out.println("****************************************");
    mul_let.l();
    System.out.println("****************************************");
	mul_let.m();
	System.out.println("****************************************");
	mul_let.n();
	System.out.println("****************************************");
	mul_let.o();
	System.out.println("****************************************");
	mul_let.p();
	System.out.println("****************************************");
	mul_let.q();
	System.out.println("****************************************");
	mul_let.r();
	System.out.println("****************************************");
	mul_let.s();
	System.out.println("****************************************");
	mul_let.t();
	System.out.println("****************************************");
	mul_let.u();
	System.out.println("****************************************");
	mul_let.v();
	System.out.println("****************************************");
	mul_let.w();
	System.out.println("****************************************");
	mul_let.x();
	System.out.println("****************************************");
	mul_let.y();
	System.out.println("****************************************");
	mul_let.z();
	System.out.println(" The Grand Ending");
	
	}
}
	
