//Link: https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=sorting

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
       int count = 1;
       HashSet<Integer> numeros = new HashSet<Integer>();
       for(int i = 0;i<nums.length;i++){
        int n = nums[i];
        if(numeros.contains(n)){
            return true;
        }
        numeros.add(n);
       }
       return false;
 }
}
