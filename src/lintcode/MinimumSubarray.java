package lintcode;

import java.util.ArrayList;

public class MinimumSubarray {
	public int minSubArray(ArrayList<Integer> nums) {
		// write your code
		int min = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < nums.size(); i++) {
		    if (result + nums.get(i) < min)
				min = result + nums.get(i);
		    else if (result + nums.get(i) > 0)
				result = 0;
			
		}
		return min;
	}
}
