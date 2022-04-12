class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 双指针 分别指向子数组的头部和尾部
        int l=0;
        int r = 0;
        int max = 0;
        while(r<nums.length){
            int sum=0;
            for(int i=l;i<=r;i++){
                sum = sum + nums[i];
            }
            if(sum<target){
                if(r<nums.length-1){
                        r++;
                }
                
            }else{
                max = Math.max(max,r-l+1);
                l++;
            }
        }
        return max;
    }
}