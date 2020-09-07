package ctci;

import java.util.HashMap;

public class PalindromePerm {

	public static void main(String[] args) {
		String s = "aabbcadadd";
		palindromeperm1(s);
	}
	

	static void palindromeperm1(String s) {
		HashMap<Character, Integer> ht = new HashMap<Character, Integer>(); 
		char ch;
		for(int i=0; i<s.length(); i++)
		{
			ch = s.charAt(i);
			if(ht.get(ch) == null) {
				ht.put(ch, 1);
			}
			else {
				int count = ht.get(ch);
				ht.put(ch, ++count);
			}
		}
		
		System.out.println(ht.toString());
		
	     int count = 0;
	     for (char key: ht.keySet()) {
	         count += ht.get(key) % 2;
	     }
	     
	     System.out.println("count is--->"+ count);
	     		
		if(count <=1) {
			System.out.println("palindrome permutation");
		}
		else {
			System.out.println("Not palindrome permutation");
		}
		
	}

}
