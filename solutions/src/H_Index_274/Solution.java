package H_Index_274;

/// use a frequency array with the same length of citations + 1
/// (the last index used for large values)
/// populate the freq array
/// traverse it from the right to left
/// add the values to the papers variable
/// if the number of papers are bigger than the index
/// the h index was found
/// return the result

public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] freq = new int[len + 1];
        int papers = 0;

        for (int value : citations) {
            if (value <= len)
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