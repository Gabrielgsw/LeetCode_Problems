//Link: https://leetcode.com/problems/climbing-stairs/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
       
        int[] matriz = new int[n];
        matriz[0] = 1; 
        matriz[1] = 2; 

        
        for (int i = 2; i < n; i++) {
            matriz[i] = matriz[i - 1] + matriz[i - 2];
        }

        
        return matriz[n - 1];
    }
}
