/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
//This solution allows a one pass through the array
//Time complexity O(n)
//Space complexity O(1)
public class StockProblem {
    public static int findMaxProfit(int [] prices){
        //find any instance where prices [i+1] is greater than prices [i]
        int max_profit = 0;
        for (int i = 0;i<prices.length-1;i++){
            if(prices [i] < prices [i+1]){
                max_profit = max_profit + (prices[i+1]-prices[i]);
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};
        findMaxProfit(myArray);
    }
}
