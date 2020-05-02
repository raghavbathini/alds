package csdsp.strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class PalindromePerm {

	public static void main(String[] args) {
		String s = "aabbcadadd";
		palindromeperm(s);
		palindromeperm1(s);
	}
	
	static void palindromeperm(String s) {
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>(); 
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
		
		Set<Entry<Character, Integer>> s1 = ht.entrySet();
		int oddcount = 0;
		for(Entry<Character, Integer> entry : s1) {
			if(entry.getValue() % 2  != 0)
				oddcount++;
		}
		
		if(oddcount > 1) {
			System.out.println("Not palindrome permutation");
		}
		else {
			System.out.println("palindrome permutation");
		}
		
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
