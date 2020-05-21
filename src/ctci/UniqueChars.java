package ctci;

import java.util.HashMap;

public class UniqueChars {

	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvbnmmx";
//		boolean isunique = isUniqueChars(s);
		boolean isunique = isUniqueCharsHM(s);
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
	
	
	static boolean isUniqueCharsHM(String s) {
		HashMap<Character, Integer> hm =  new HashMap<Character, Integer>();
		
		for(char ch: s.toCharArray()) {
			if(!hm.containsKey(ch))
				hm.put(ch, 1);
			else {
				int v = hm.get(ch);
				hm.put(ch, ++v);
				if(v > 1)
					return false;
			}
		}
		return true;
	}


}
