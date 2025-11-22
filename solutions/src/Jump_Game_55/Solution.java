package Jump_Game_55;

class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int jump_max;
        int target = len - 1;

        for(int i = len - 1; i >= 0; i--) {
            jump_max = nums[i];
            if(i + jump_max >= target)
                target = i;
        }
        return target == 0;
    }
}