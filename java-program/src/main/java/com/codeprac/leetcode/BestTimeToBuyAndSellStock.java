package com.codeprac.leetcode;

public class BestTimeToBuyAndSellStock {

    public static int findOutMaxProfit(int[] prices) {
        int min = prices[0];
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++){
            int cost = prices[i] - min;
            maxProfit = Math.max(maxProfit, cost);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = findOutMaxProfit(prices);
        System.out.println(result);
    }
}
