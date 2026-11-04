/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {

    let j = 0;
    for(let i = 0;i<nums.length;i++){
        if(nums[i] === val){
            j = i;
            let init = nums[0]
            let curr = nums[i]
            let next = i == nums.length - 1 ? curr : nums[i+1]
            nums[j] = j == 0 ?  next : init 
            nums[0] = curr
            nums.shift();
            i = i - 1
            
        }
        
    }


    return nums.length
};
