package corejava.practice;

import java.util.Random;

public class randomLongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long LOWER_RANGE = 1000000L; //assign lower range value
		 long UPPER_RANGE = Long.MAX_VALUE; //assign upper range value
		 long randomValue = 0L;
		 Random random = new Random();
		 for(int i=0; i<100; i++) {
			 System.out.println(getRandomInteger(1,100));
		 }
	}
	
	public static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

	
}
