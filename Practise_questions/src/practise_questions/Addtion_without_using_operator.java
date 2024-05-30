package practise_questions;

public class Addtion_without_using_operator {

	public static void main(String[] args) {

		int a = 10;
		int b = 100;

		Sample s = new Sample();
		System.out.println(s.sample(a, b));
	}
}

class Sample {
	int ans;
	int sample(int a, int b) {
		
	ans=a-(-b);
		return ans;

	}
}