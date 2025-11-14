package Palindrome_Number_9;

class Solution {
    public boolean isPalindrome(int x) {
        int inv = 0;
        int copy_x = x;
        if(x < 0)
            return false;

        while(x != 0) {
            inv = inv * 10 + x % 10;
            x = x / 10;
        }

        return inv == copy_x;

    }
}