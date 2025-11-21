package Best_Time_to_Buy_and_Sell_Stock_II_122;

/// Iterate through all elements in the array.
/// Traverse the elements while they are in decreasing order.
/// mini will represent the last element of the decreasing subarray.
/// Then traverse the elements while they are in increasing order.
/// maxi will represent the last element of the increasing subarray.


public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sum = 0;

        int i = 0;
        while(i < n - 1) {
            int mini = Integer.MAX_VALUE;
            int maxi = 0;

            while(i < n - 1 && prices[i] >= prices[i + 1])
                i++;
            mini = prices[i];

            while(i < n - 1 && prices[i] <= prices[i + 1])
                i++;
            maxi = prices[i];

            sum += maxi - mini;

        }
        return sum;
    }
}