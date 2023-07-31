package com.corejava.interviewprograms;


/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock 
 * and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. 
 * If you cannot achieve any profit, return 0.

 */
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};
		
		//Result: Buy=2, Sell=5
		System.out.println("Profit: "+ maxProfit(prices));
	}
	
    public static int maxProfit(int[] prices) {
    	
    	int buyDay = 1;
    	int sellDay = 2;
    	int profit = 0;
    	
    	for(int i = 0; i < prices.length; i++) {
    		for(int j = i; j < prices.length; j++) {
    			if(prices[j] - prices[i] > profit) {
    				buyDay = i+1;
    		    	sellDay = j+1;
    		    	profit = prices[j] - prices[i];
    			}
    		}
    	}
    	System.out.println("buyDay: " + buyDay);
    	System.out.println("sellDay: " + sellDay);
    	
        return profit;
    }
}
