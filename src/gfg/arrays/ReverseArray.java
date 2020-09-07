package gfg.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a [] = {34,12,76,32,9,14,7};
		System.out.println("Before:--> "+Arrays.toString(a));
		reversearray(a);
		System.out.println("After:--> "+Arrays.toString(a));
		

	}
	
	static void reversearray(int a[])
	{
		int l = 0; int h = a.length-1;
		while(l<h) {
			int temp = a[l];
			a[l] = a[h];
			a[h] = temp;
			l++;
			h--;
		}
		
	}

}
