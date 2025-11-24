package Happy_Number_202;

import java.util.HashMap;

public class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        while(n != 1) {
            int sum = 0;

            while(n > 0) {
                int ld = n % 10;
                sum = sum + ld * ld;
                n /= 10;
            }

            if(map.get(sum) == null)
                map.put(sum, 1);
            else
                return false;

            n = sum;
            sum = 0;
        }
        return true;

    }
}