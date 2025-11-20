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

        while(left < right) {
            int aux = nums[left];
            nums[left] = nums[right];
            nums[right] = aux;

            left++;
            right--;
        }

        left = 0;
        right = k - 1;
        while(left < right) {
            int aux = nums[left];
            nums[left] = nums[right];
            nums[right] = aux;

            left++;
            right--;
        }

        left = k;
        right = n - 1;
        while(left < right) {
            int aux = nums[left];
            nums[left] = nums[right];
            nums[right] = aux;

            left++;
            right--;
        }

    }
}