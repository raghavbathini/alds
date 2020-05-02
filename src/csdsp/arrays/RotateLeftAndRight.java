package csdsp.arrays;

import java.util.Arrays;

public class RotateLeftAndRight {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		System.out.print("Before rotation--->"+Arrays.toString(a));
//		rotaterighttemparr(a, 10);
//		rotateright(a, 10);
//		rotateleftbyone(a);
		rotateleftbyk(a, 2);
	}
	
	static void rotaterighttemparr(int[] a, int k) {
		int len = a.length;
		int n= k % len;
		int[] result = new int[len];
		
		for(int i=0; i<3; i++) {
			result[i] = a[len-n+i];
		}
		int j=0;
		for(int i=n; i<len; i++) {
			result[i] = a[j];
			j++;
			
		}
		System.out.println();
		for(int e: result)
			System.out.print(e +" ");
			
	}

	
	static void rotateright(int[] a, int k) {
		int len = a.length;
		int n= k % len;
		
		for(int i=0; i<n; i++)
		{
			int temp = a[len-1];
			for(int j=len-1; j>0; j--)
			{
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
		
		System.out.println();
		for(int e: a)
			System.out.print(e +" ");
	}
	
	
	static void rotateleftbyone(int[] a) {
		int len = a.length;
		int temp = a[0];
		int i = 0;
		
		for(i=0; i<len-1; i++)
			a[i] = a[i+1];
		a[i] = temp;
		
		System.out.println();
		System.out.println("After left rotate by one-->"+Arrays.toString(a));
	}
	
	static void rotateleftbyk(int[] a, int k) {
		int len = a.length;
		int i,j = 0;
		
		for(i=1; i<=k; i++)
		{
		int temp = a[0];	
		for(j=0; j<len-1; j++)
			a[j] = a[j+1];
		a[j] = temp;
		}
		System.out.println();
		System.out.println("After left rotate by one-->"+Arrays.toString(a));
	}
}
