
//Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1430552879/?envType=problem-list-v2&envId=string
class Solution {
    public int strStr(String haystack, String needle) {
        int l = needle.length();
        if (l == 0) {
            return 0; 
        }
        if (haystack.contains(needle)) {
            for (int i = 0; i <= haystack.length() - l; i++) {
                if (haystack.substring(i, i + l).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
