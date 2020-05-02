package csdsp.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ElementsInWindows {

	public static void main(String[] args) {
		int a[] = { 10, 20, 20, 10, 30, 40, 10 };
		findDistinctElementsofWindow(a, 4);

	}

	private static void findDistinctElementsofWindow(int[] a, int k) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			if (!hm.containsKey(a[i]))
				hm.put(a[i], 1);
			else {
				int val = hm.get(a[i]);
				hm.put(a[i], ++val);
			}

		}
		result.add(hm.keySet().size());

		for (int i = k; i < a.length; i++) {
			int val = hm.get(a[i - k]);
			val = val - 1;

			if (val == 0)
				hm.remove(a[i - k]);
			else
				hm.put(a[i - k], val);

			if (!hm.containsKey(a[i]))
				hm.put(a[i], 1);
			else {
				val = hm.get(a[i]);
				hm.put(a[i], ++val);
			}
			result.add(hm.keySet().size());

		}
		System.out.println(result.toString());
	}
}
