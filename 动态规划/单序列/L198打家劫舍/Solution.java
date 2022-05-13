package 动态规划.单序列.L198打家劫舍;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    HashMap cache ;
    public int rob(int[] nums) {

        cache=  new HashMap<Integer,Integer>();
        int len = nums.length;
        return Math.max(dfs(nums,len-1),dfs(nums,len-2))  ;
    }

    private int dfs(int[] nums, int i) {
        if (i==0){
            return nums[0];
        }else if (i==1){
            return Math.max(nums[0],nums[1]);
        }else if (i==2){
            return Math.max(nums[0]+nums[i],nums[1]);
        }
        if ( cache.get(i)==null ){
//            cache[i] =Math.max(dfs(nums,i-2), dfs(nums,i-3) )+ nums[i] ;
            cache.put(i,Math.max(dfs(nums,i-2), dfs(nums,i-3) )+ nums[i]);
        }
        return (int) cache.get(i);


//        return Math.max(  cache[i-2], cache[i-3]) + nums[i] ;
    }


    //迭代
//    public int rob(int[] nums) {
//        int sum = 0;
//        //存储总值
//        int[] arr = new int[nums.length];
//        arr[0] = nums[0];
//        arr[1] = Math.max(nums[0],nums[1]);
//        arr[2] = Math.max(nums[0]+nums[2],nums[1]);
//        for (int i = 3 ; i <nums.length ; i++) {
//            arr[i] = Math.max(arr[i-2],arr[i-3]) + nums[i];
//        }
//        return Math.max(nums[nums.length-1],nums[nums.length-2]);
//    }

}
