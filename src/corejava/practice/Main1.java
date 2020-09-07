package corejava.practice;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main1 {
    public static int process(String str) {
        /* 
         * Modify this method to process `str` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	int count = 0;
    	Character present_char;
    	boolean start = false;
        if(str != null){
            for(int i = 0; i < str.length(); i++){
            	present_char = str.charAt(i);
                if(Character.isWhitespace(present_char)){
                	start = true;
                }
                else {
                	if(start == true) {
                		count++;
                		start = false;
                	}
                		
                	
                }
            }
        }
        return count;
    }

    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            String line = in.nextLine();
            int retVal = process(line);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
