package Zigzag_Conversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        int dir = 1;
        int count = 0;

        if(numRows == 1)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        for(int i = 0; i < len; i++) {
            rows[count].append(s.charAt(i));
            if(count == numRows - 1) {
                dir = -1;
            } else if(count == 0)
                dir = 1;

            count += dir;

        }

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            str.append(rows[i]);
        }

        return str.toString();
    }
}