package hr.warmup;

public class JumpingClouds {
	   // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] a) {
    	int n = a.length;
    	int count = 0;
    	int i = 0;
    	while(i < n-2) {
    		if(a[i+2] == 0 || a[i+1] == 1)
    		{
    			count++;
    			i+=2;
    		}
    		else {
    			count++;
    			i+=1;
    		}
    	}
    	
    	if(i < n-1 && a[i] == 0)
    		count++;
    	return count;

    }

    public static void main(String[] args) {
    	
    	int[] c = {0,0,1,0,0,1,0};
    	
//    	int[] c = {0,0,0,0,1,0};
    	
//    	int[] c = {0,1,0,0,0,1,0};

        int result = jumpingOnClouds(c);
        
        System.out.println("result--->"+ result);


    }
}