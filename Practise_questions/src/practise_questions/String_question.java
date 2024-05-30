package practise_questions;

public class String_question {
	public static void main(String[] args) {

		String str = "{hello java}";
		Sam s = new Sam();
		System.out.println(s.sam(str));
	}
}

class Sam {
	String sam(String s) {

		if (s.startsWith("{") && s.endsWith("}")) {
			return "thumbs_up";
		} else if (s.startsWith("[") && s.endsWith("]")) {
			return "Thumb";
		} else if (s.startsWith("(") && s.endsWith(")")) {
			return "paranthesys";
		} else if (s.startsWith("<") && s.endsWith(">")) {
			return "Angular brasis";
		}
		return "**";

	}
}
