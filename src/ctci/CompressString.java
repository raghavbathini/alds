package ctci;

public class CompressString {

	public static void main(String[] args) {
		String s = "aabcccccaaa";
		
		String result = compress(s);
		
		System.out.println("result is--->"+ result);

	}
	
	
	public static String compress(String s) {
		int count = 0;
		StringBuilder cs = new StringBuilder();
		char last = s.charAt(0);
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == last)
				count++;
			else {
				cs.append(last+""+count);
				count = 1;
			}
			last = s.charAt(i);
		}
		cs.append(last+""+count);
		String new_srtring = cs.toString();
		if(new_srtring.length() < s.length())
			return new_srtring;
		else
			return s;
			
	}

}
