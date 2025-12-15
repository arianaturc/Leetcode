package Isomorphic_Strings_205;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        HashMap<Character, Character> map = new HashMap<>(0,26);
        HashMap<Character, Character> reverseMap = new HashMap<>();

        if(n != m)
            return false;

        int i = 0;

        while(i < n) {
            char ch = s.charAt(i);
            char ch_t = t.charAt(i);

            if (map.get(ch) != null && map.get(ch) != ch_t)
                return false;
            if(reverseMap.get(ch_t) != null && reverseMap.get(ch_t) != ch)
                return false;

            map.put(ch, ch_t);
            reverseMap.put(ch_t, ch);
            i++;

        }
        return true;
    }
}