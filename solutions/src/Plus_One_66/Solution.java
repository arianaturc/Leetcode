package Plus_One_66;

import java.util.Collections;
/// basic case when there is no carry
/// else
/// create a new array in reverse order of the initial one
///  digits = 99 => res = 001
public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int len = digits.length;
        int[] res = new int[len + 1];
        int n = 0;

        if(digits[len - 1] + carry <= 9) {
            digits[len - 1] = digits[len - 1] + 1;
            return digits;
        }

        for(int i = len - 1; i >= 0; i--) {
            if(digits[i] + carry > 9) {
                res[n++] = 0;
                carry = 1;
            } else {
                res[n++] = digits[i] + carry;
                carry = 0;

            }

        }

        if(carry == 1)
            res[n] = 1;
        else {
            n--;
        }

        int[] final_res = new int[n + 1];
        int j = 0;
        for(int i = n; i >= 0; i--) {
            final_res[j++] = res[i];
        }

        return final_res;
    }
}