package H_Index_274;

public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] freq = new int[len + 1];
        int papers = 0;

        for(int i = 0; i < len; i++) {
            int value = citations[i];
            if(value <= len)
                freq[value]++;
            else freq[len]++;
        }

        int k = len;
        while(k >= 0) {
            papers += freq[k];
            if(papers >= k)
                break;
            k--;
        }

        return k;

    }
}