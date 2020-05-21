package gfg.arrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
//		int[] a = { 2, 7, 5, 9, 13, 2, 7 };
//		finddupshashset(a);
//		finddupshashtable(a);
		int[] a = { 10, 20, 20, 30, 30, 30, 30 };
//		int[] a = { 10, 10, 10 };
		removes_dups_sortedarray(a);
		
	}
	
	static void finddupshashset(int[] a) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int num: a) {
			if(!hs.add(num))
				System.out.println("duplicate element is: "+ num);
		}
	}
	
	static void finddupshashtable(int[] a) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		for(int num: a) {

			if(ht.get(num) == null) {
				ht.put(num,1);
			} else {
				int count = ht.get(num);
				ht.put(num, ++count);
			}
		}
		
		System.out.println(ht.toString());
		Set<Entry<Integer, Integer>> s = ht.entrySet();
		for(Entry<Integer, Integer> entry : s) {
			if(entry.getValue() > 1) {
				System.out.println("duplicate element is: "+ entry.getKey());
			}
		}
		
	}
	
	public static void removes_dups_sortedarray(int[] a) {
		int ni=0;
		int l = a.length;
		int i = 0;
		for(i=0; i<l-1; i++) {
			if(a[i]!=a[i+1]) {
				a[ni] = a[i];
				ni++;
			}
		}
		if(a[ni] != a[i])
			a[ni] = a[i];
		
		for(i=0; i<=ni; i++)
			System.out.println(a[i]);
	}

}
