package m4.s14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise {
	/**
	 * Extract from input the even values and return them in a List
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	public List<Integer> evens(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (Integer num : data) {
			if (num % 2 == 0) {
				result.add(num);
			}
		}
		return result;
	}

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 * 
	 *         example: in {2, 3, 4, 4} -> out {2, 3}
	 */
	public List<Integer> singles(int[] data) {
		// DA SISTEMARE
		ArrayList<Integer> result = new ArrayList<Integer>();
		Arrays.sort(data);
		boolean vale = true;

		for (int i = 0; i < data.length - 1; i++) {
			if (vale && data[i] != data[i + 1]) {
				result.add(data[i]);
			} else {
				vale = false;
				while ( i<data.length-2 && !vale && data[i] == data[i + 1]) {
						if(i<data.length-2) {
							
						}
						i++;
					}
				vale=true;
				}
			}
		return result;
		}
		
	

	/**
	 * As above, but with a linear time algorithm
	 * 
	 * @param data
	 * @return
	 */
	public ArrayList<Integer> singlesLinear(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
//		for(int num: data) {
//			if(map.)
//		}
		

		return result;
	}
}
