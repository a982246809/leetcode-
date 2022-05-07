package 排序.快速排序.L快速排序;

import java.util.Random;

public class Solution {
//[3,2,1,5,6,4]
//        2
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortArray(new int[]{3,2,1,5,6,4}));
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public void quickSort(int[] nums,int start,int end){
        //分而治之   对中间树 左右进行 快速排序
        //中点下标
        if (end>start){
            int pivot = partition(nums,start,end);
            quickSort(nums,pivot+1,end);
            quickSort(nums,start,pivot-1);
        }

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
