package 二分查找.L875爱吃香蕉的珂珂;

import java.util.Arrays;

public class Solution {
//[3,6,7,11]
//        8

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minEatingSpeed(new int[]{3,6,7,11},8));
    }
    public int minEatingSpeed(int[] piles, int h) {
        //最小速度为1 , 最大速度为 piles.max
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        //最小值设为int最大值
        int minMid = r;
        while (l<=r){
            int mid = (l+r)/2;
            int e= equalH(piles,  h, mid);
            if (e<=0){
                if (equalH(piles,  h, mid-1)>0){
                  return  mid;
                }
                r= mid-1;
            }else {
                l=mid + 1;
            }
        }
        return minMid;
    }
    public int equalH(int[] piles, int h,int mid){
        int total =0;
        for (int i = 0; i < piles.length; i++) {
            //向上取整

            total+=  Math.ceil((double)piles[i]/mid);
        }
        return total-h;
    }

}
