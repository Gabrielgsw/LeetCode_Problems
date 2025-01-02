
//Link: https://leetcode.com/problems/is-subsequence/?envType=problem-list-v2&envId=dynamic-programming
class Solution {

    int pos = 0;
    int count = 0;
    public boolean isSubsequence(String s, String t) {
        
        if(s.isEmpty()){
            return true;
        }

        if(t.isEmpty()){
            return false;
        }

        for(int i = 0;i<t.length();i++){
            if((s.charAt(pos) == t.charAt(i)) && pos < s.length() ){
                pos++;
                count++;
                 if(count == s.length()){
                     return true;
                    }

                
            }
        }

    

        return false;


    }
}
