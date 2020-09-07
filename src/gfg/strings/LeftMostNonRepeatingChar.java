package gfg.strings;

public class LeftMostNonRepeatingChar {

	public static void main(String[] args) {
		String s = "balasubramaniyam";
//		String s = "cccccccabcdefghijklmnop";
		
		int fI[] = new int[256];
		int result = Integer.MAX_VALUE;
		
		for(int i=0; i<256; i++)
			fI[i] = -1;
		
		for(int i=0; i<s.length(); i++)
			if(fI[s.charAt(i)] == -1)
				fI[s.charAt(i)] = i;
			else
				fI[s.charAt(i)] = -2;
		
		for(int i=0; i<256; i++)
			if(fI[i] >= 0)
				result = Math.min(result, fI[i]);
		
		System.out.println(result);

	}

}
