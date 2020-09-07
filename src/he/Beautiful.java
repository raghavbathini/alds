package he;

import java.util.Scanner;

public class Beautiful {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number_of_inputs = s.nextInt();
		for (int i = 0; i < number_of_inputs; i++) {
			int n = s.nextInt();
			for (int j = 1; j <= n; j++) {
				if (j % 15 == 0)
					System.out.println("FizzBuzz");
				else if (j % 3 == 0)
					System.out.println("Fizz");
				else if (j % 5 == 0)
					System.out.println("Buzz");
				else
					System.out.println(j);
			}
		}

	}

}
