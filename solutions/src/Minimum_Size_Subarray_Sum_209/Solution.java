package Minimum_Size_Subarray_Sum_209;

import java.util.Arrays;

/// move with for on the elem of the array
/// and add each elem tp the sum
/// while the sum is greater than target decrease the size window (use l pointer)
/// before moving the l pointer, subtract from the sum the value at the position l
/// and then increase l

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        boolean found = false;
        int sum = 0;
        int l = 0;


        for(int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while(sum >= target) {
                found = true;
                if(r - l + 1 < len)
                    len = r - l + 1;
                sum -= nums[l];
                l++;

            }
        }
        if(found)
            return len;
        else return 0;

    }
}
