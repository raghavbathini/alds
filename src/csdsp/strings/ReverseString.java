package csdsp.strings;

public class ReverseString {

	public static void main(String[] args) {
//		String s = "";
//		String s = "a";
//		String s = "ab";
		String s = "My Name is Raghavender";
		System.out.println("Reversed String is-->" + reverse(s));
	}

	public static String reverse(String s) {
		char[] sa;
		int length = s.length();
		if (length < 2) {
			return s;
		} else {
			sa = s.toCharArray();
			int firstindex = 0;
			int lastindex = s.length() - 1;
			char temp;
			while (firstindex < lastindex) {
				temp = sa[firstindex];
				sa[firstindex] = sa[lastindex];
				sa[lastindex] = temp;
				firstindex++;
				lastindex--;
			}
		}
		return String.valueOf(sa);

	}

}
