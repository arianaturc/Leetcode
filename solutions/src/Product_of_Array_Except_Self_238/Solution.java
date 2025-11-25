package Product_of_Array_Except_Self_238;

/// built an array with the products of the elements in the left
/// and an array with the products of the elements in the right
/// the value of the left(i) will be p = p * nums(j), j = 0, ..., i - 1
/// the value of the right(i) will be p = p * nums(j), j = len, ..., i + 1
/// the elements of the resulted array will be the multiplication of the values from the two arrays

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;

        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        for(int i = 0; i < len; i++) {
            if(i == 0) {
                left[i] = p;
            }
            else {
                p *= nums[i - 1];
                left[i] = p;
            }

        }

        p = 1;
        for(int i = len - 1; i >= 0; i--) {
            if(i == len - 1) {
                right[i] = p;
            }
            else {
                p *= nums[i + 1];
                right[i] = p;
            }

        }

        for(int i = 0; i < len; i++) {
            int res = left[i] * right[i];
            nums[i] = res;
        }

        return nums;
    }
}