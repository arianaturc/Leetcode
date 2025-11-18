package Find_the_Index_of_the_First_Occurrence_in_a_String_28;


public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0; i < n - m + 1; i++) {
            if(haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

/*
public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int i = 0;
        while(i < n) {
            int j = 0;
            while(j < m && i + j < n) {
                if(haystack.charAt(i + j) != needle.charAt(j))
                    break;
                j++;
            }
            if(j == m)
                return i;
            i++;
        }
        return -1;

    }
}
*/