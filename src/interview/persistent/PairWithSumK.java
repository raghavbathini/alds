package interview.persistent;

import java.util.HashSet;

public class PairWithSumK {

	public static void main(String[] args) {
		int a[] = {2,5,3,7,9,1};
		int sum = 10;
		
		printPairs(a, sum);

	}
	
	static void printPairs(int a[], int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int temp;
		
		for(int i=0; i<a.length; i++) {
			temp = sum - a[i];
			if(hs.contains(temp)) {
				System.out.println("pair is: "+temp +","+ a[i]);
			}else {
				hs.add(a[i]);
			}
		}
		
	}

}
