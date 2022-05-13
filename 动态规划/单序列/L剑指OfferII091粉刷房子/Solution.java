package 动态规划.单序列.L剑指OfferII091粉刷房子;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int minCost(int[][] costs) {
//        //3个方程 , 分别 对应 , 第i栋 , 选红蓝绿 的 最小成本
//        //红为例  r(i) = min(b(i-1),g(i-1)) + costs[i,0]
//        int[][] dp = new int[3][costs.length];
//        //把各颜色 i=0的情况  赋值
//        for (int i = 0; i < 3; i++) {
//            dp[i][0] = costs[0][i];
//        }
//        for (int i = 1; i < costs.length; i++) {
//            dp[0][i] = Math.min(dp[1][i-1],dp[2][i-1]) + costs[i][0];
//            dp[1][i] = Math.min(dp[0][i-1],dp[2][i-1]) + costs[i][1];
//            dp[2][i] = Math.min(dp[1][i-1],dp[0][i-1]) + costs[i][2];
//        }
//        int last = costs.length-1;
//        return Math.min(dp[0][last],Math.min(dp[1][last],dp[2][last]));

//        优化空间到 1
        int[][] dp = new int[3][2];
        //把各颜色 i=0的情况  赋值
        for (int i = 0; i < 3; i++) {
            dp[i][0] = costs[0][i];
        }
        for (int i = 1; i < costs.length; i++) {
            dp[0][i%2] = Math.min(dp[1][(i-1)%2],dp[2][(i-1)%2]) + costs[i][0];
            dp[1][i%2] = Math.min(dp[0][(i-1)%2],dp[2][(i-1)%2]) + costs[i][1];
            dp[2][i%2] = Math.min(dp[1][(i-1)%2],dp[0][(i-1)%2]) + costs[i][2];
        }
        int last = costs.length-1;
        return Math.min(dp[0][last],Math.min(dp[1][last],dp[2][last]));
    }
}
