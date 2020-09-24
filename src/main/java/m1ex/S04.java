package m1ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		if (first > last) {
			return 0;
		}
		int sum = 0;
		while (first <= last) {
			sum += first;
			first++;
		}
		return sum;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		if (first > last) {
			return 0;
		}
		int sum = 0;
		while (first <= last) {
			if (first % 2 == 0) { // sommo se è pari
				sum += first;
			}
			first++;
		}
		return sum;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		double epsilon = 0.001;
		double ris = 1;
		double buf = 1.1;
		if (value < 0) {
			return 0; // controlla
		}
		while (Math.abs(ris - buf) > epsilon) {
			buf = ris;
			ris = ris / 2 + value / (2 * ris);
		}
		return ris;
	}

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		double ris = 1;
		double buf = 1.1;
		if (value < 0) {
			return 0; // controlla
		}
		while (Math.abs(ris - buf) > epsilon) {
			buf = ris;
			ris = ris / 2 + value / (2 * ris);
		}
		return ris;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if (value < 1) {
			return 0;
		}
		int prod = 1;
		while (value > 1) {
			prod *= value;
			value--;
		}
		return prod;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
//		if(value==0) {
//			
//		}else if(){
//			
//		}else {
//			
//		}
		return 0;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
