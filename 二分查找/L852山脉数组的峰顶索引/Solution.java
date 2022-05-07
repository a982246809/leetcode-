package 二分查找.L852山脉数组的峰顶索引;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length;
        while (l<=r){
            int center = (l+r)/2;
            if (arr[center]>arr[center-1]&&arr[center]>arr[center+1]){
                return center;
            }
            if (arr[center]<arr[center+1]){
                l = center;
            }else  if (arr[center]<arr[center-1]){
                r = center;
            }
        }
        return r;
    }
}
