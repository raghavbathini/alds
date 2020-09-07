package gfg.strings;

import java.util.HashMap;

public class MyAnagrams {

	public static void main(String[] args) {
		String s1 = "testing";
		String s2 = "ingtest";
		
		boolean result1 = areAnagrams1(s1, s2);
		boolean result2 = areAnagrams2(s1, s2);
		System.out.println("result1--->"+ result1);
		System.out.println("result2--->"+ result2);
	}
	
	public static boolean areAnagrams1(String s1, String s2) {
		int count[] = new int[256];
		if(s1.length() != s2.length())
			return false;
		
		for(int i=0; i<s1.length();i++) {
			count[s1.charAt(i)]++;
		}
		
		for(int i=0; i<s2.length();i++) {
			count[s2.charAt(i)]--;
		}
			
		for(int i=0; i<256; i++)
			if(count[i]>0) {
				return false;
			}
		
		
		return true;
	}
	
	
	public static boolean areAnagrams2(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		
		for(int i=0; i<s1.length();i++) {
			Character ch = s1.charAt(i);
			if(hm1.containsKey(ch)) {
				int val = hm1.get(ch);
				hm1.put(ch, ++val);
			} else {
				hm1.put(ch, 1);
			}
				
		}
		
		for(int i=0; i<s2.length();i++) {
			Character ch = s2.charAt(i);
			if(hm2.containsKey(ch)) {
				int val = hm2.get(ch);
				hm2.put(ch, ++val);
			} else {
				hm2.put(ch, 1);
			}
				
		}
		
		System.out.println(hm1.toString());
		System.out.println(hm2.toString());
		
		if(hm1.equals(hm2))
			return true;
		else
			return false;
			

	}


}
