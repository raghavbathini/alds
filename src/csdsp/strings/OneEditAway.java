package csdsp.strings;

public class OneEditAway {

	public static void main(String[] args) {
		String s1 = "ale";
		String s2 = "male";
		
		boolean result =  isoneeditaway(s1, s2);
		
		System.out.println("final result is-->"+ result);
		
	}
	
	static boolean isoneeditaway(String s1, String s2) {
		boolean result = true;
		
		if(s1.equals(s2)) {
			result = false;
			return result;
		}
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1 == l2) {
			result = isreplaceedit(s1, s2);
		}else if(l1 > l2) {
			result = isdeleteinsertedit(s1, s2);
		}else {
			result = isdeleteinsertedit(s2, s1);
		}
		return result;
	}
	
	static boolean isreplaceedit(String s1, String s2) {

		
		int i=0;
		int count = 0;
		boolean result = true;
		
		int l1 = s1.length();
		
		while(i<l1) {
			if(s1.charAt(i) != s2.charAt(i)) {
				count++;
			}
			if(count > 1) {
				result = false;
				break;
			}
			i++;
		}
		
		return result;
		
	}
	
	static boolean isdeleteinsertedit(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		while (index1 < s1.length() && index2 < s2.length()) {
			if (chars1[index1] != chars2[index2]) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}	
	 

}
