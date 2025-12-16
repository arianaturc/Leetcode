package Length_of_Last_Word;

public class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        int count = 0;
        while(s.charAt(n) == ' ') {
            n--;
        }
        while(n > -1 && s.charAt(n) != ' ') {
            count++;
            n--;
        }
        return count;
    }
}
