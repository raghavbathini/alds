package gfg.arrays;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int a[] = { 3, 13, 19, 1, 27, 11, 89, 5, 100, 120 };
		int sum = 22;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int l = 0;
		int h = a.length-1;
		boolean found = false;
		
		while(l < h )
		{
			if(a[l] + a[h] == sum)
			{
				found = true;
				break;
			}
			else if(a[l] + a[h] > sum) {
				h--;
			}
			else {
				l++;
			}
		}
		
		if(found)
			System.out.println("two elements are ---->"+a[l]+" ,"+ a[h]);
		else
			System.out.println("no elements in array whose sum is "+ sum);
			
		

	}

}
