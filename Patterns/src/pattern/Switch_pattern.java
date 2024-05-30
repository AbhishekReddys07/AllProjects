package pattern;

import java.util.Scanner;

public class Switch_pattern {
	static void a() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n / 2 + 1 || j == 1 || j == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static void b() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n / 2 + 1 || i == n || j == 1 || j == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void c() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void d() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 2 || i == 1 || i == n || j == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void e() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == 5 || i == 3) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void f() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n / 2 + 1) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void g() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n || (i > n / 2 && j == n) || (i == (n / 2 + 1) && j > n / 2)) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void h() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == n / 2 + 1) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void i() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n / 2 + 1 || i == 1 || i == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void j() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || (i == n && j <= n / 2 + 1) || j == n / 2 + 1) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void k() throws InterruptedException {
		int n = 5;
		int x = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 2 + 1; j++) {
				if (j == 1 || j == x) {
					Thread.sleep(100);
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			if (i <= n / 2) {
				x--;
			} else {
				x++;
			}
			System.out.println();
		}
	}

	static void l() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void m() throws InterruptedException {
		int n = 5;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || ((j == x || j == n - x + 1) && i <= n / 2 + 1)) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			x++;
			System.out.println();
		}
	}

	static void n() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == j) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void o() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || j == n || i == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void p() throws InterruptedException {
		int n = 5;
		int x = (n / 2) + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1 && j <= x) || j == 1 || (j == x && i <= x) || (i == x && j <= x)) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void q() throws InterruptedException {
		int n = 7;
		int x = n - n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((i == 1 || i == x + 1) && j <= x + 1) || ((j == 1 || j == x + 1) && i <= x + 1)) {
					Thread.sleep(100);
					System.out.print("*");
				} else if (j == i && i >= x) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void r() throws InterruptedException {
		int n = 7;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 2 + 1; j++) {
				if (j == 1 || i == 1 || i == n / 2 + 1 || (i <= n / 2 && j == n / 2 + 1) || j == x) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i > n / 2) {
				x++;
			}
			System.out.println();
		}
	}

	static void s() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n | i == n / 2 + 1 || (j == 1 && i <= n / 2 + 1) || (j == n && i > n / 2 + 1)) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void t() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == n / 2 + 1) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void u() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || j == 1 || j == n) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void v() throws InterruptedException {
		int n = 5;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2 * n; j++) {
				if (j == x || j == 2 * n - x) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x++;
		}
	}

	static void w() throws InterruptedException {
		int n = 5;
		int x = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2 * n; j++) {
				if (j == 1 || j == 2 * n - 1 || j == x || j == 2 * n - x) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
	}

	static void x() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == n - i + 1) {
					Thread.sleep(100);
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void y() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j == i || j == n - i + 1) && i <= n / 2 + 1 || (j == n / 2 + 1 && i > n / 2)) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void z() throws InterruptedException {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n - i + 1) {
					Thread.sleep(100);
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter Your Name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String str = name.toLowerCase();
		sc.close();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
				a();
				System.out.println("******************************");
				break;
			case 'b':
				b();
				System.out.println("*****************************");
				break;
			case 'c':
				c();
				System.out.println("*****************************");
				break;
			case 'd':
				d();
				System.out.println("*****************************");
				break;
			case 'e':
				e();
				System.out.println("*****************************");
				break;
			case 'f':
				f();
				System.out.println("**************************");
				break;
			case 'g':
				g();
				System.out.println("**************************");
				break;
			case 'h':
				h();
				System.out.println("*****************************");
				break;
			case 'i':
				i();
				System.out.println("*****************************");
				break;
			case 'j':
				j();
				System.out.println("*****************************");
				break;
			case 'k':
				k();
				System.out.println("*****************************");
				break;
			case 'l':
				l();
				System.out.println("*****************************");
				break;
			case 'm':
				m();
				System.out.println("*****************************");
				break;
			case 'n':
				n();
				System.out.println("*****************************");
				break;
			case 'o':
				o();
				System.out.println("*****************************");
				break;
			case 'p':
				p();
				System.out.println("*****************************");
				break;
			case 'q':
				q();
				System.out.println("*****************************");
				break;
			case 'r':
				r();
				System.out.println("*****************************");
				break;
			case 's':
				s();
				System.out.println("*****************************");
				break;
			case 'u':
				u();
				System.out.println("*****************************");
				break;
			case 'v':
				v();
				System.out.println("*****************************");
				break;
			case 'w':
				w();
				System.out.println("*****************************");
				break;
			case 'x':
				x();
				System.out.println("*****************************");
				break;
			case 'y':
				y();
				System.out.println("*****************************");
				break;
			case 'z':
				z();
				System.out.println("*****************************");
				break;

			default:
				System.out.println(" ");
				break;

			}
		}

	}
}
