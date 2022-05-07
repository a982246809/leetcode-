package 二分查找.L704二分查找;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        while (left<=right){
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                right = mid -1 ;
            }else if (nums[mid]<target){
                left = mid +1 ;
            }
        }
        return -1;
    }
}
