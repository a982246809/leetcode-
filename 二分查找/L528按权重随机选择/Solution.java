package 二分查找.L528按权重随机选择;

import java.util.Random;

public class Solution {

    int[] pre ;
    int total;

    public static void main(String[] args) {
        Solution solution = new Solution(new int[0]);
        System.out.println(solution);
    }

    public Solution(int[] w) {
        for (int i = 0; i < w.length; i++) {
            total+=w[i];
            pre[i] = total;
        }
    }

    public int pickIndex() {
        int l = 0;
        int r = pre.length;
        Random random = new Random();
        int p = random.nextInt(total);
        while (l<=r){
            int sum = (l+r)/2;
            if (pre[sum]>p){
                if (sum==0||pre[sum-1]<=p){
                    return sum;
                }
                r = sum-1;
            }else {
                l = sum+1;
            }
        }
        return -1;
    }

}
