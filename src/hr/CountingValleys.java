package hr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        if(n == 0 || s.length() == 0)
            return 0;
    	int position = 0;
    	int vcount = 0;
    	for(int i=0; i<s.length(); i++)
    	{
    		if(s.charAt(i) == 'U')
    			position = position+1;
    		else
    			position = position-1;
    		
    		if(position == 0 && s.charAt(i)== 'U' && i>1)
    			vcount++;
    	}

    	return vcount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();
    	int n=8;
    	String s="UDDDUDUUDUDDDUDUUU";

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println("number of valleys travelled ---> "+ result);

        scanner.close();
    }
}
