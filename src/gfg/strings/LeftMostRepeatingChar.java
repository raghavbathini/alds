package gfg.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		String s = "abbcdeekforgeeks";
		int i = findLeftMostRepeatedIndex(s);
		System.out.println(i);

	}
	
	public static int findLeftMostRepeatedIndex(String s) {
		int result = Integer.MAX_VALUE;
		int fI[] = new int[256];
		for(int i=0; i<256; i++)
			fI[i] = -1;
		for(int i=s.length()-1; i>=0; i--) {
			Character ch = s.charAt(i);
			if(fI[ch] == -1)
				fI[ch] = i;
			else
				result = i;
		}
		
		if(result == Integer.MAX_VALUE)
			return -1;
		else
			return result;
	}
	

}
