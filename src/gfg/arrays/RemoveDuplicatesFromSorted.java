package gfg.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {

	public static void main(String[] args) {
		int a[] = {10,10,20,20,30,30,30,30};
		System.out.println("Before--> "+ Arrays.toString(a));
		int s = removedups(a);
		System.out.print("After--> ");
		for(int i=0; i<s; i++)
			System.out.print(a[i]+",");
	}
	
	public static int removedups(int a[]) {
		int p = 1;
		int ni = 1;
		while(p < a.length) {
			if(a[p-1] != a[p]) {
				a[ni] = a[p];
				ni++;
			}
			p++;
		}
		return ni++;
	}

}
