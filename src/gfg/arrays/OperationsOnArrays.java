package gfg.arrays;

import java.util.Arrays;

public class OperationsOnArrays {

	public static void main(String[] args) {
		int a[] = {3,8,12,5,6};
		deleteElementsInArray(a, 12);
	}
	
	public static void deleteElementsInArray(int a[], int ele) {
		System.out.println("defore deletion--->"+ Arrays.toString(a));
		int l = a.length;
		int i;
		for(i=0; i<l; i++)
		{
			if(a[i] == ele)
				break;
		}
		
		for(int j=i; j<l-1; j++)
			a[j]=a[j+1];
		
		System.out.println("after deletion--->"+ Arrays.toString(a));
	}
	

}
