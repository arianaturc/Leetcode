package Reverse_Words_in_a_String_151;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        Stack<Object> word_queue = new Stack<>();
        int len = s.length();
        int i = 0;
        int space = 0;

        StringBuilder str = new StringBuilder();
        while(i < len) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                if(space == 0 && str.length() > 0) {
                    word_queue.push(str.toString());
                    str.setLength(0);
                }
                space++;
            } else {
                space = 0;
                str.append(ch);
            }

            i++;
        }
        if(str.length() > 0)
            word_queue.push(str.toString());

        StringBuilder res = new StringBuilder();

        while (!word_queue.isEmpty()) {
            res.append(word_queue.pop());
            if (!word_queue.isEmpty()) {
                res.append(" ");
            }
        }


        return res.toString();

    }
}