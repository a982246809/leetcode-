package 二分查找.L540有序数组中的单一元素;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length -1 ;
        while (l<=r){
            int cent = (l+r)/2;
            if (cent==l||cent==r){
                return nums[cent];
            }
            if (nums[cent] !=nums[cent-1]||nums[cent]!=nums[cent+1]){
                return nums[cent];
            }

            if (nums[cent] ==nums[cent-1]){
                r = cent-1;
            }else if (nums[cent]==nums[cent+1]){
                l = cent+1;
            }
        }
        return 0;
    }

}
