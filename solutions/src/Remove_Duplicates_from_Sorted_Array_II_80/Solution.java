package Remove_Duplicates_from_Sorted_Array_II_80;

/// i is used to go through all the elements in the array
/// j is moved only if the count <= 2
public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        int count = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i - 1] )
               count++;
            else count = 1;

            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }
}