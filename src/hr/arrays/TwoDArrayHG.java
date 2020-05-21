package hr.arrays;

public class TwoDArrayHG {

	public static void main(String[] args) {
		int [][] a = {{1,1,1,0,0,0}, 
					  {0,1,0,0,0,0},
					  {1,1,1,0,0,0},
					  {0,0,2,4,4,0},
					  {0,0,0,2,0,0},
					  {0,0,1,2,4,0}};
		int result = hourglassSum(a);
		System.out.println(result);
		}

	
    static int hourglassSum(int[][] arr) {
    	int sum = 0;
    	int max_sum = Integer.MIN_VALUE;
    	
    	for(int i=0; i<4; i++){
    		for(int j=0; j<4; j++) {
        		sum = 0;
    			sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        		if(sum > max_sum)
        			max_sum = sum;
    		}
    	}
    	
    	return max_sum;
    }

}
