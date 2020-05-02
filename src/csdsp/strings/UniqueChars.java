package csdsp.strings;

public class UniqueChars {

	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvbnmm";
		boolean isunique = isUniqueChars(s);
		if(isunique) {
			System.out.println("Given string has unique characters");
		}
		else {
			System.out.println("Given string does not have unique characters");
		}
		

	}
	
	
	static boolean isUniqueChars(String s) {
		boolean[] ba = new boolean[128];
		
		if(s.length() > 128)
			return false;
		
		for(int i=0; i<s.length(); i++) {
			int chvalue = s.charAt(i);
			if(ba[chvalue])
				return false;
			else
				ba[chvalue] = true;
		}
		
		return true;	
	}

}
