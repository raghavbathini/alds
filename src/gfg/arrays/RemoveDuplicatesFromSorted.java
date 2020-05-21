package gfg.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,30,30};
		int s = removedups(a);
		for(int i=0; i<s; i++)
			System.out.println(a[i]);
	}
	
	public static int removedups(int a[]) {
		int l = a.length;
		System.out.println("defore -->"+ Arrays.toString(a));
		int new_index = 1;
		a[new_index++] = a[0];
		
		for(int i=1; i<l-1; i++) {
			if(a[i] != a[i+1]) {
				a[new_index] = a[i];
				new_index++;
			}
			
		}
		return new_index;
	}

}
