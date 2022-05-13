package 动态规划.L使用最小花费爬楼梯;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(new int[] {1,0,0,1}));
    }

    public int minCostClimbingStairs(int[] cost) {
//       状态转移方程 f(i) = min(f(i-1),f(i-2)) + cost[i]
        return 0;
    }

    private int dfs(int[] cost, int i ) {
        return 0;
    }
}
