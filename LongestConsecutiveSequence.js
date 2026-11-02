/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    
    if(!nums){
        return 0
    }

    var res = 0;

    var nums_Set = new Set(nums);

    for(let num of nums_Set){

        if(!nums_Set.has(num-1) ){
            let length = 1;
            let curr = num;

            while(nums_Set.has(curr + 1)){
                curr += 1
                length += 1
            }

            res = Math.max(length, res)
        }

    }

    return res





};
