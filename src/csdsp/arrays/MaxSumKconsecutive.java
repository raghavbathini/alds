package csdsp.arrays;

public class MaxSumKconsecutive {

	public static void main(String[] args) {
		int a[] = {1,8,30,-5,20,7};
		int result1 = maxSumOfKconsecutives1(a, 3);
		int result2 = maxSumOfKconsecutives2(a, 3);
		System.out.println("result1-->"+ result1);
		System.out.println("result2-->"+ result2);
	}
	
	public static int maxSumOfKconsecutives1(int[] a, int k) {
		int max_sum = 0,curr_sum = 0;
		int l = a.length;
		
		for(int i=0; i<l-k+1; i++)
		{
			curr_sum = 0;
			for(int j=i;j<k+i;j++)
				curr_sum+=a[j];
			if(curr_sum > max_sum)
				max_sum = curr_sum;
		}
		return max_sum;
	}
	
	public static int maxSumOfKconsecutives2(int[] a, int k) {
		int max_sum = 0,curr_sum = 0;
		int l = a.length;
		
		for(int i=0;i<k;i++)
			curr_sum+=a[i];
		
		max_sum = curr_sum;
		for(int i=1; i<l-k+1; i++)
		{
			curr_sum = curr_sum - a[i-1];
			curr_sum = curr_sum + a[i+k-1];
			
			if(curr_sum > max_sum)
				max_sum = curr_sum;
		}
		return max_sum;
	}


}
