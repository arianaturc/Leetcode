package Jump_Game_55;

/// start from the end of the array
/// first, the target is the last element
/// then check if from the previous element can get to the target
/// if so, move the target to the previous element and so on
/// if the target becomes the first element
/// the function will return true
/// else it will return false


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