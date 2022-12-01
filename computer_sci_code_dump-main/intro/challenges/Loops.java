public class Loops {
	public static void main(String[] args) {
		sumOfOneHundredInt(); 	// Should print 5050
		sumOfIntegers(50);    	// Should print 1275
		sumOfEvenIntegers(100); // Should print 2550 
		countDoubling(3);		// Should print 6.

		// TODO: Add another function call to calculate the sum of integers between 1 and 1000
	}

	/**
	 * This function should compute the sum of the integers between 1 and 100
	 * (inclusive) using a for loop. Use the variable sum to store the partial
	 * sum.
	 */
	private static void sumOfOneHundredInt() {
		int sum = 0;
		int n = 1;
		for (int i = 1; i < 101; i++){
			sum = (sum + n);
			n = (n + 1);
		}
		System.out.println("The sum 1+2+3+...+100 = " + sum);
	}

	/**
	 * This function should compute the sum of the integers between 1 and n
	 * (inclusive) using a for loop. Use the variable sum to store the partial
	 * sum.
	 * 
	 * @param n the upper bound for the integers added to the sum.
	 */
	private static void sumOfIntegers(int n) {
		int sum = 0;
		int u = 1;
		for (int i = 1; i < (n + 1); i++){
			sum = (sum + u);
			u = (u + 1);
		}
		System.out.println("The sum of the integers from 1 to " + n + " is " + sum);
	}


	/**
	 * This function should compute the sum of the EVEN integers between 1 and n
	 * (inclusive) using a for loop.
	 * 
	 * @param n the upper bound for the integers added to the sum.
	 */
	private static void sumOfEvenIntegers(int n) {
		int sum = 0;
		int u = 2;
		
		if (u <= n){
			while (u <= n){
				sum = (sum + u);
				u = (u + 2);
			}
		} else if (u >= n){
			System.out.println("The sum of the even integers from 1 to " + n + " is " + sum);
		}
		System.out.println("The sum of the even integers from 1 to " + n + " is " + sum);
	}

	/**
	 * Lastly, this function should use a while loop to double the value of 
	 * num unitl it reaches 100 or more. Use the variable count to keep track
	 * of how many times num is doubled.
	 * 
	 * @param num the number we will double each time through the loop
	 */
	private static void countDoubling(int num) {
		int count = 0; // Counts how many times we doubled num.
		while (num < 100){
			num = (num * 2);
			count = (count + 1);
		}
		System.out.println("num was doubled " + count + " times before reaching 100.");
	}
}