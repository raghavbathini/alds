package hr.warmup;

import java.io.*;
import java.util.*;

public class SocksMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int result = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++)
        {
            if(!hm.containsKey(ar[i])){
            	hm.put(ar[i], 1);
            }else {
            	int val = hm.get(ar[i]);
            	hm.put(ar[i], ++val);
            }
        }
        System.out.println(hm.toString());
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
        	result = result + entry.getValue()/2;
        }
        
        return result;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = {10,20,20,10,10,30,50,10,20};

//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
        int n = 9;


        int result = sockMerchant(n, ar);
        System.out.println("result is---->"+ result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

//        scanner.close();
    }
}
