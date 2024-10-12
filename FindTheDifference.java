//Link: https://leetcode.com/problems/find-the-difference/description/?envType=problem-list-v2&envId=sorting&favoriteSlug=&difficulty=EASY%2CMEDIUM

class FindTheDifference {
    public char findTheDifference(String s, String t) {
        //String result;
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        for(int i = 0;i<t1.length;i++){
            if(i == t1.length - 1){
                return t1[i];
            }
            char a = s1[i];
            char b = t1[i];
            if(a != b){
                return t1[i];
            }
        }
        return ' ';
    }
}
