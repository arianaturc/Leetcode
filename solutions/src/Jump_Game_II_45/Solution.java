package Jump_Game_II_45;

/// 2,   3,1,   1,4
/// 0     1      2
///
/// initialize end, far and mini with 0
/// traverse all the elements in the array
/// check if the current position + the value at that position is greater than far
/// if so, far will be i + the value
/// if it gets to the end of a region ( i == end)
/// mini will be incremented (mini - minimum number of steps)
/// and end will be updated with the value of far

public class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int end = 0;
        int far = 0;
        int mini = 0;

        for(int i = 0; i < len - 1; i++) {
            if((i + nums[i]) > far)
                far = i + nums[i];

            if(i == end) {
                mini += 1;
                end = far;
            }

        }

        return mini;
    }
}