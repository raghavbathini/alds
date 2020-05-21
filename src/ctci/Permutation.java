package ctci;

import java.util.Arrays;
import java.util.Hashtable;

public class Permutation {

	public static void main(String[] args) {
		boolean perm = strperm(" Abcd", "dcba");
		if(perm) {
			System.out.println("Given strings are anagrams");
		}
		else {
			System.out.println("Given strings are not anagrams");
		}

	}
	
	static boolean strpermutation(String s1, String s2) {
		Hashtable<Character, Integer> ht1 = new Hashtable<Character, Integer>();
		Hashtable<Character, Integer> ht2 = new Hashtable<Character, Integer>();
		char ch;
		for(int i=0; i<s1.length(); i++)
		{
			ch = s1.charAt(i);
			if(ht1.get(ch) == null) {
				ht1.put(ch, 1);
			}
			else {
				int count = ht1.get(ch);
				ht1.put(ch, ++count);
			}
		}
		System.out.println(ht1.toString());
		
		for(int i=0; i<s2.length(); i++)
		{
			ch = s1.charAt(i);
			if(ht2.get(ch) == null) {
				ht2.put(ch, 1);
			}
			else {
				int count = ht1.get(ch);
				ht2.put(ch, ++count);
			}
		}
		System.out.println(ht2.toString());
		
		if(ht1.equals(ht2))
			return true;
		else
			return false;
					
	}
	
	static String sort(String s) {
		char[] carray = s.toCharArray();
		Arrays.parallelSort(carray);
		
		return new String(carray);
	}
	
	
	static boolean strperm(String s1, String s2) {
		String ls1 = s1.toLowerCase();
		String ls2 = s2.toLowerCase();
		String tls1 = ls1.trim();
		String tls2 = ls2.trim();
		if(tls1.length() != tls2.length())
			return false;
		
		return sort(tls1).equals(sort(tls2));
	}

}
