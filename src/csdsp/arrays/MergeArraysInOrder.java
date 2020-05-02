package csdsp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArraysInOrder {

	public static void main(String[] args) {
		int a1[] = { 4, 9, 2, 12, 35, 17, 7,10,200, 300, 400, 500, 600 };
		int a2[] = { 3, 13, 19, 1, 27, 11, 89, 5, 100, 120 };
		List<Integer> marr = new ArrayList<Integer>();
		Arrays.sort(a1);
		Arrays.sort(a2);

		int i = 0;
		int j = 0;

		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				marr.add(a1[i]);
				i++;
			} else {
				marr.add(a2[j]);
				j++;
			}
		}

		if (a1.length < a2.length) {
			while (j < a2.length) {
				marr.add(a2[j]);
				j++;
			}
		} else {
			while (i < a1.length) {
				marr.add(a1[i]);
				i++;
			}
		}

		System.out.println(marr.toString());

	}

}
