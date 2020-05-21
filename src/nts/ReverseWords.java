package nts;

public class ReverseWords {

	public static void main(String[] args) {
		String s = reversestring("India is the best country");
		System.out.println(s);
		

	}
	
	public static String reversestring(String s) {
		String[] al = null;
		al = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=al.length-1; i>=0; i--) {
			sb.append(al[i] + " ");
		}
		String r = sb.toString();
		return  r;
		
	}

}
