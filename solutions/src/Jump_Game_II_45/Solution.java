package Jump_Game_II_45;


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