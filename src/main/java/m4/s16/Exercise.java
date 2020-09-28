package m4.s16;

import java.util.*;

public class Exercise {
	public static void main(String[] args) {
		Integer[] vet = Exercise.singles(new int[]{1,1,3,4,7,1,4});
		for(Integer i: vet) {
			System.out.println("ciao" + i);
		}
	}
    /**
     * Generate an array that contains only once each value (possibly duplicated) in
     * the input array
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 53, 35 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data an array with duplicates
     * @return a stripped copy of the original array
     */
    public static Integer[] singles(int[] left) {
        HashSet<Integer> risultato=new HashSet<>();
        for(Integer num: left) {
        	risultato.add(num);
        }
        return risultato.toArray(new Integer[(risultato.size())]);
    }
}
