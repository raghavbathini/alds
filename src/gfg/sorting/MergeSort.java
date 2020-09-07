package gfg.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = {45,98,12,32,9,17,4,10};
		
		mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));

	}
	
	public static void mergeSort(int []a, int l, int h) {
		if(l<h) {
		int m = (l+h)/2;
		mergeSort(a, l , m);
		mergeSort(a, m+1, h);
		merge(a,l,m,h);
		}
	}
	
	public static void merge(int a[], int l, int m, int h) {
		int n1 = m-l+1;
		int n2 = h - m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		int i; int j; int k = l;
		
		// prepare aux arrays
		for(i=0; i<n1; i++)
			left[i] = a[l+i];
		for(j=0; j<n2; j++)
			right[j] = a[m+1+j];
		
		i=0 ; j=0; k=l;
		
		while(i<n1 && j <n2) {
			if(left[i] <= right[j])
				a[k++] = left[i++];
			else
				a[k++] = right[j++];
		}
		
		while(i<n1) a[k++]=left[i++];
		while(j<n2) a[k++]=right[j++];
		
		
		
		
	}

}
