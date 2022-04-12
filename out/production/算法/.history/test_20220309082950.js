/**
 * @param {number[]} nums
 * @return {number}
 */
 var test = function(nums) {
     
    let sum = 0
    let map = new Map()
    map.set(0,-1)
    let len = 0;
    for(let i=0;i<nums.length;i++){
        sum = sum + (nums[i]||-1)
       console.log(sum)
        if(map.get(sum)){
            len = Math.max(len,i -map.get(sum) )
        }else{
             map.set(sum,i)
        }
    }
    return len;
};

test([0,0,1])