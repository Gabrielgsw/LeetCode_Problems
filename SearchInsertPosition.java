
//Link: https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=array
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid = 0;
        //int pos = 0;
        while(last >= first){
            mid = (int)((first + last)/2);
            if(target < nums[0]){
                return 0;
            }
            if(nums[mid] == target){
                return mid;
            }
            else{
                if(target < nums[mid]){
                    last = mid - 1;
                }else{
                    first = mid + 1;
                }
            }
        }


        return first;
    }

}
