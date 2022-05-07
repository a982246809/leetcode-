package 二分查找.L35搜索插入位置;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1,3,5,6},2));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid=0;
        while (left<=right){

            mid = (left+right)/2;

            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                // if(left==right){
                //     return left==0 ? 0 : left-1;
                //   }
                right = mid -1 ;

            }else if (nums[mid]<target){
                //  if(left==right){
                //     return left+1;
                //   }
                left = mid +1 ;
            }
        }
        //  if(mid==left){
        if(mid==0&&nums[mid]>target){
            return 0;
        }
        if (nums[mid]>target){

                 return mid;


        }else if (nums[mid]<target){

                 return mid+1;

        }
        return mid+1;
        // }

    }
}
