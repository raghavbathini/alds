package gfg.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
//		String s = "balasubramaniyam";
		String s = "abcdefghijklmnop";
		
		int fI[] = new int[256];
		int result = -1;
		
		for(int i=0; i<256; i++)
			fI[i] = -1;
		
		for(int i=s.length()-1; i>0; i--)
			if(fI[s.charAt(i)] == -1)
				fI[s.charAt(i)] = i;
			else
				result = i;
		
		System.out.println(result);

	}

}
