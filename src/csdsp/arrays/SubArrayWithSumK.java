package csdsp.arrays;

public class SubArrayWithSumK {

	public static void main(String[] args) {
//		int a[] = {1,8,30,-5,20,7};
		int a1[] = {1,4,20,3,10,5};
//		boolean result1 = subArrayWithWithSumNSizeK(a, 3, 44);
		boolean result2 = subArrayWithSumK(a1, 15);
//		System.out.println("result1-->"+ result1);
		System.out.println("result2-->"+ result2);
	}
	
	
	
	public static boolean subArrayWithWithSumNSizeK(int[] a, int k, int sum) {
		int curr_sum = 0;
		int l = a.length;
		boolean result = false;
		
		for(int i=0;i<k;i++)
			curr_sum+=a[i];
		
		for(int i=1; i<l-k+1; i++)
		{
			curr_sum = curr_sum - a[i-1];
			curr_sum = curr_sum + a[i+k-1];
			
			if(curr_sum == sum) {
				result = true;
				break;
			}
				
		}
		return result;
	}
	
	
	public static boolean subArrayWithSumK(int[] a, int sum) {
		int curr_sum = a[0];
		int l = a.length;
		boolean result = false;
		int start_index = 0;
		int end_index = 0;
		
		while(end_index < l)
		{
			if(curr_sum < sum) {
				curr_sum += a[++end_index];
			}
			else if(curr_sum > sum) {
				curr_sum -= a[start_index++];
			}
			else {
				result = true;
				break;
			}
				
		}
		return result;
	}



}
