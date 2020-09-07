package gfg.strings;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "enlist";
		
		boolean result = areAnagrams(s1, s2);
		if(result)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	
	static boolean areAnagrams(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		int count[] = new int[256];
		
		for(int i=0; i<s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
			
		for(int i=0; i<256; i++)
			if(count[i]!=0)
				return false;
		
		
		return true;	
	}

}
