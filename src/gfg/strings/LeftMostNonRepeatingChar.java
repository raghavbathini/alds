package gfg.strings;

public class LeftMostNonRepeatingChar {

	public static void main(String[] args) {
//		String s = "balasubramaniyam";
		String s = "cccccccabcdefghijklmnop";
		
		int fI[] = new int[256];
		int result = -1;
		
		for(int i=0; i<256; i++)
			fI[i] = -1;
		
		for(int i=s.length()-1; i>=0; i--)
			if(fI[s.charAt(i)] == -1)
				result = i;
			else
				fI[s.charAt(i)] = i;
		
		System.out.println(result);

	}

}
