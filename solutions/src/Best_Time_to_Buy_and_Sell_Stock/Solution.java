package Best_Time_to_Buy_and_Sell_Stock;


public class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0, profit = 0;
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < mini) {
                mini = prices[i];
            }
            profit = prices[i] - mini;
            if(profit > max_profit) {
                max_profit  = profit;
            }
        }
        return max_profit;
    }

}

/*
public class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int pos_min = 0, pos_max = 0;
        int profit = 0;
        int pos_min_profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < mini) {
                pos_min = i;
                mini = prices[i];
            }
            if(prices[i] > maxi && i >= pos_min) {
                maxi = prices[i];
                pos_max = i;
            }
            if(profit < maxi - mini && pos_max > pos_min) {
                pos_min_profit = pos_min;
                profit = maxi - mini;
            }
            if(pos_min > pos_max) {
                maxi = 0;
            }
        }
        if(pos_max > pos_min_profit)
            return profit;
        return 0;

    }
}*/