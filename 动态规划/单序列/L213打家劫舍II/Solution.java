package 动态规划.单序列.L213打家劫舍II;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int rob(int[] nums) {
        //分解成两个子问题
//        0~n-2
//            1~n-1
        return Math.max( helper(nums,0,nums.length-2), helper(nums,1,nums.length-1));
    }

    private int helper(int[] nums, int start, int end) {
       int[] arr = new int[nums.length-1];
       arr[0] = nums[start];
       arr[1] = nums[start + 1];
        for (int j = start + 2; j <= end; j++) {
            arr[j] = Math.max(arr[j-2] + nums[j],arr[j-1]);
        }
        return Math.max(arr[arr.length-1],arr[arr.length-2]);
    }

}
