package gfg.arrays;

import java.util.HashMap;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		int a[] = {2,5,3,7,3,5,2,3,5,1,2,4};
//		int r = firstRecurring(a);
		int r = bf_firstRecurring(a);
		if(r == -1) {
			System.out.println("no recurring character");
		}else {
			System.out.println("first recurring character is-->"+ r);
		}
		
		
		

	}
	
	
	public static int bf_firstRecurring(int a[]) {
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length; j++) {
				if(a[i] == a[j])
					return a[i];
			}
		}
		return -1;
	}
	
	public static int firstRecurring(int a[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
			if(!hm.containsKey(a[i])) {
				hm.put(a[i], 1);
			}
			else {
				int v = hm.get(a[i]);
				hm.put(a[i], ++v);
			}
			
			int v = hm.get(a[i]);
			if(v > 1) {
				return a[i];
			}
		}
		return -1;
	}

}
