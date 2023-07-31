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
		int[] prices = new int[] {7,1,5,3,8,4};
		
		//Result: Buy=2, Sell=5, Profit: 8-1=7
		System.out.println("Profit: "+ maxProfit(prices));
		
		System.out.println("Profit: "+ maxProfitLinearTime(prices));
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
    
    public static int maxProfitLinearTime(int[] prices) {
    	int buyDay = 1;
    	int sellDay = 2;
    	
        int min = Integer.MAX_VALUE, max_profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                buyDay = i+1;
            }
            if(max_profit < prices[i]-min) {
            	sellDay = i+1;
            }
            max_profit = Math.max(max_profit,prices[i]-min);
        }
        
    	System.out.println("buyDay: " + buyDay);
    	System.out.println("sellDay: " + sellDay);
    	
        return max_profit;
    }
}
