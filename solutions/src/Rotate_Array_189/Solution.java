package Rotate_Array_189;

///rotate the entire array first
///then rotate first k % n - 1 elements
///then rotate the remaining elements

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = nums.length - 1;
        k = k % n;

        reverse(nums, left, right);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int aux = nums[left];
            nums[left] = nums[right];
            nums[right] = aux;

            left++;
            right--;
        }
    }

}