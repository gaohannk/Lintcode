package lintcode;

import java.util.Arrays;

/* Given n items with size A[i], an integer m denotes the size of a backpack. How full you can fill this backpack? 
 * Note
 * You can not divide any item into small pieces.
 * Example
 * If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can select 2, 3 and 5,
 * so that the max size we can fill this backpack is 10. If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.
 * You function should return the max size we can fill in the given backpack.
 */
public class Backpack {
	public int backPack(int m, int[] A) {
		// write your code here
		int result = 0;
		int max = 0;
		Arrays.sort(A);
		for (int j = A.length - 1; j >= 0; j--) {
			for (int i = j; i >= 0; i--) {
				if (A[i] + result > m)
					continue;
				else
					result += A[i];
			}
			if (result > max)
				max = result;
			result = 0;
		}
		return max;
	}
}
