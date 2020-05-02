package csdsp.arrays;

import java.util.HashSet;

public class ArraySumPairs {

	public static void main(String[] args) {
		int a[] = { 3, 13, 19, 1, 27, 11, 89, 5, 100, 120, 7 };
		int sum = 8;
		printpairs(a, sum);
	}

	static void printpairs(int[] a, int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			int temp = sum - a[i];
			
			if(hs.contains(temp)) {
				System.out.println("required pair is ---->" + temp + ", "+ a[i]);
				count++;
			}
			else {
				hs.add(a[i]);
			}
		}


		System.out.println("number of required pairs are--> "+ count);

	}

}
