package gfg.strings;

public class IsAnagramPresent {

	public static void main(String[] args) {
		String s = "abcdefghij";
		String p = "ihjgi";
		boolean result = isAnagramPresent(s,p);
		System.out.println("result --> "+result);

	}
	
	static boolean isAnagramPresent(String s, String p){
		int countString[] = new int[256]; 
		int countPattern[] = new int[256];
		
		for(int i=0; i<p.length(); i++) {
			countString[s.charAt(i)]++;
			countPattern[p.charAt(i)]++;
		}
		
		for(int i=p.length(); i<s.length(); i++) {
			if(areSame(countString, countPattern))
				return true;
			countString[s.charAt(i)]++;
			countString[s.charAt(i - p.length())]--;
		}
		
		// If matching pattern is at last of string
		if(areSame(countString, countPattern))
			return true;
		return false;	
	}
	
	static boolean areSame(int a[], int b[]) {
		for(int i=0; i<256; i++)
			if(a[i]!=b[i])
				return false;
		return true;
	}

}
