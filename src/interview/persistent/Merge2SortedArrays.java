package interview.persistent;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int a[] = {2,5,8,11,23};
		int b[] = {1,3,6,9,17,32,45};
		
		
		merge2Arrays(a,b);
	}
	
	static void merge2Arrays(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		if(a.length == 0 || b.length == 0) {
			System.out.println("empty array is given");
			return;
		}
		
		int i=0, j=0 , k=0;

		while(i<a.length && j<b.length) {
			if(a[i] < b[j]) {
				c[k] = a[i];
				i ++;
			}else {
				c[k] = b[j];
				j ++;
			}
			k++;
			
		}
		
		if(a.length > b.length) {
			for(int l=i; l< a.length; l++)
				c[k++] = a[l];
		} else {
			for(int l=j; l< b.length; l++)
				c[k++] = b[l];
		}
			
		System.out.println(Arrays.toString(c));

}
}
