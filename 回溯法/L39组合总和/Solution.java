package 回溯法.L39组合总和;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    int[] nums;
    int target;
    int sum;
    public List<List<Integer>> combinationSum(int[] candidates, int target2) {
        nums = candidates;
        target = target2;
        LinkedList<List<Integer>> res = new LinkedList<>();
        dfs(res , 0 , new LinkedList<Integer>());
        return  res;
    }

    private void dfs(LinkedList<List<Integer>> res, int i, LinkedList<Integer> sub) {
        if (sum>=target||i==nums.length){
            if (sum==target){
                res.add(new LinkedList<>(sub));
            }
            return;
        }
        sum+=nums[i];
        sub.add(nums[i]);
        dfs(res, i, sub);
        sum-=nums[i];
        sub.removeLast();
        dfs(res,i+1,sub);
    }

}
