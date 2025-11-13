package Contains_Duplicate_II_219;

import java.util.HashMap;

import static java.lang.Math.abs;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.get(num) == null) {
                map.put(num, i);
            } else {
                int val = abs(i - map.get(num));
                if( val <= k)
                    return true;
                map.replace(num, i);
            }
        }
        return false;
    }
}