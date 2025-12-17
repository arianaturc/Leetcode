package Two_Sum_II_Input_Array_Is_Sorted_167;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int lp = 0, rp = numbers.length - 1;
        while(lp < rp) {
            int sum = 0;
            sum = numbers[lp] + numbers[rp];
            if(sum == target) {
                result[0] = lp + 1;
                result[1] = rp + 1;
                break;
            }
            else if(sum > target)
                    rp--;
            else lp++;
        }
        return result;

    }

}