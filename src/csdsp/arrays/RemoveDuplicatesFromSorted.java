package csdsp.arrays;

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
		int new_index = 0;
		System.out.println("defore -->"+ Arrays.toString(a));
		for(int i=0; i<l-1; i++) {
			if(a[i] != a[i+1]) {
				if(i!=0) 
					a[new_index] = a[i+1];
				else 
					a[new_index] = a[i];
				new_index++;
			}
			
		}
		return new_index;
	}

}
