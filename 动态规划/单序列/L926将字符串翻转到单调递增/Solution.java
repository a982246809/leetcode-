package 动态规划.单序列.L926将字符串翻转到单调递增;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int minFlipsMonoIncr(String s) {
//        有两个状态
//    所以两个状态转移方程
        //1 翻转之后 符合要求并结尾为0 , 因为i-1 一定为0,不然不符合   f(i) = f(i-1) + s[i]
        //2 结尾为1 , i-1 是 0,1 都可能 : g(i) = Math.min( f(i-1) , g(0-1) ) + s[i]==0 ? 1 : 0;
        return 0;
    }
}
