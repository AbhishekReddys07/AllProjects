package practise_questions;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Question1 {

	public static void main(String[] args) {
		new re().method();

	}
}

class re {
	public void method() {
		String str = "29AD962BAA22";
		char[]ch=str.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < str.length(); i++) {
			System.out.print(ch[i]);
		}
		
		}
}