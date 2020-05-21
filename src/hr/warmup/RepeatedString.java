package hr.warmup;

import java.io.*;
import java.util.*;

public class RepeatedString {

	// Complete the countingValleys function below.
	static long repeatedString(String s, long n) {
		long count = 0;
		int numofa_in_one = 0;
		long l = s.length();
		long numofrepeats = n / l;
		long partial_string = n % l;
		
		for(int i=0; i<l; i++)
			if(s.charAt(i) == 'a')
				numofa_in_one++;
		
		count = count+ (numofa_in_one*numofrepeats);
		numofa_in_one = 0;
		
		for(int i=0; i<partial_string; i++)
			if(s.charAt(i) == 'a')
				numofa_in_one++;
		
		count+= numofa_in_one;
		
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();
		  String s = "a";
		  long n = 1000000000;

		long result = repeatedString(s, n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
		System.out.println("number of valleys travelled ---> " + result);

		scanner.close();
	}
}
