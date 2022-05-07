package 排序.归并排序.归并排序;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        [5,2,3,1]
        System.out.println(solution.sortArray(new int[]{5,2,3,1}));
    }



    public int[] sortArray(int[] nums) {
        int[] dst = new int[nums.length];
        mergeSort(nums,dst,0,nums.length-1);
        return dst;
    }

    private void mergeSort(int[] nums, int[] dst, int start, int end) {
        if (start>=end){
            return;
        }
        int mid = (start+end) / 2;
        mergeSort(nums,dst,0,mid);
        mergeSort(nums,dst,mid+1,end);

        int i =start,j=mid, k = start;

        while(i<mid||j<end){
            if (j==end || (i<mid&&nums[i]<nums[j])){
                dst[k++] = nums[i++];
            }else {
                dst[k++] = nums[j++];
            }
        }

    }


}
