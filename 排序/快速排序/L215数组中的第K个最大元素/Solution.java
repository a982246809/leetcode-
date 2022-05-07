package 排序.快速排序.L215数组中的第K个最大元素;

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(new int[]{3,2,1,5,6,4},2));
    }

    public int findKthLargest(int[] nums, int k) {
        //对数组进行分区
        //第k个最大值 的 坐标为 k-1
        int start = 0;
        int end = nums.length-1;
        int target = k-1;

        int  index = partition(nums,start,end);
        while(index!=target){
            if(index > target){
//                start = index + 1;
                 end = index -1;

            }else{
                 start = index + 1;
//                end = index -1;
            }
            index = partition(nums,start,end);
        }

        return nums[index];

    }

    private int partition(int[] nums, int start, int end) {
        //生成一个 nums 中的随机小标
        int random = new Random().nextInt(end-start+1) + start;
        //进行分边
        //中间值 与最后  互换
        //p1 指向 最后一个小于中间值的数字     i 为p2 扫描数组 , 遇到比中间值小的 , 与p1交换数字
        swap(nums,random,end);
        int small = start -1;
        for (int i = start; i < end; i++) {
            if (nums[i]>nums[end]){
                small++;
                swap(nums,small,i);
            }
        }
        //在把开始放在最后的中间值  交换回来
        small++;
        swap(nums,small,end);
        return small;
    }

    private void swap(int[] nums, int index1, int index2) {
        if(index1!=index2){
            int temp = nums[index1];
            nums[index1] = nums[index2] ;
            nums[index2]=temp;
        }

    }

}
