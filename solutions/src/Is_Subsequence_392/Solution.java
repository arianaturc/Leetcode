package Is_Subsequence_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();

        if(n > m)
            return false;

        while(i < n) {
            while(j < m) {
                if(s.charAt(i) == t.charAt(j)) {
                    j++;
                    i++;
                    break;
                }
                j++;
            }
            if(j == m && i < n)
                return false;
        }
        return true;
    }
}