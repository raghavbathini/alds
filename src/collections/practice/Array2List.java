package collections.practice;

// Java program to demonstrate conversion of 
// Array to ArrayList of fixed-size. 
import java.util.*; 

public class Array2List {



		public static void main (String[] args) 
		{ 
			String[] geeks = {"Rahul", "Utkarsh", 
							"Shubham", "Neelam"}; 
			
			Integer[] igeeks = {4,2,6,3,1}; 

			// Conversion of array to ArrayList 
			// using Arrays.asList 
			List al = Arrays.asList(igeeks); 

			System.out.println(al); 
		} 
	} 
