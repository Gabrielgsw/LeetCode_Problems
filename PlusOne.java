// Linke -> https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {       

        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            if(digits[i] == 9){
                digits[i] = 0;
            }
        }

        int[] number = new int[digits.length + 1];
        for(int i = 1;i<number.length - 1;i++){
            number[i] = digits[i];
        }
        number[0] = 1;
        

        return number;
    }
}
