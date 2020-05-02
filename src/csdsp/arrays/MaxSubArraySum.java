package csdsp.arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {
//		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		int[] a = {-2,-3,4,-1,-2,1,5,-3};
		printmaxsum(a);

	}
	
	static void printmaxsum(int[] a) {
		int max_sum = Integer.MIN_VALUE;
		int new_sum = 0;
		for(int i=0; i< a.length; i++)
		{
			new_sum = new_sum + a[i];
			
			if(new_sum > max_sum)
				max_sum = new_sum;
			
			if(new_sum < 0)
				new_sum = 0;
		}
		
		System.out.println("max sum is--->"+max_sum);

	}
	


}
