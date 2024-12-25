//Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int menorPreco = Integer.MAX_VALUE; 

        for (int price : prices) {
            
            if (price < menorPreco) {
                menorPreco = price;
            }
            
            result = Math.max(result, price - menorPreco);
        }

        return result;
    }
}
