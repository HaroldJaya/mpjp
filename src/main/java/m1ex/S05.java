package m1ex;


public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		return s.equals(S05.reverse(s));
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder builder = new StringBuilder("");
		char attuale;
		for (int i = 0; i < s.length(); i++) {
			attuale=s.charAt(i);
			if (attuale == 'a' || attuale == 'e' || attuale == 'i' || attuale == 'o'
					|| attuale == 'u' || attuale == 'A' || attuale == 'E' || attuale == 'I'
					|| attuale == 'O' || attuale == 'U') {
				continue;
			}
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// [1][0][0][0][1]
		// 43_210
		// 2

		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		// TODO

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int max=data[0];
		for(int i=1; i<data.length;i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		return max;
	}
}