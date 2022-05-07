package 回溯法.L40组合总和II;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    int[] nums;
    int target;
    public List<List<Integer>> combinationSum2(int[] candidates, int target2) {

        //将数字排序   在跳过相同的数字
        Arrays.sort(nums);
        target = target2;
        nums = candidates;
        LinkedList<List<Integer>> res = new LinkedList<>();
        dfs(res,0,new LinkedList<Integer>());
        return res;
    }

    private void dfs(LinkedList<List<Integer>> res, int i, LinkedList<Integer> sub) {

        if (target<=0 ||i==nums.length ){
            if (target==0){
                res.add(new LinkedList<>(sub) );
            }
            return;
        }


        sub.add(nums[i]);
        target-=nums[i];
        dfs(res,getNext(i),sub);
        sub.removeLast();
        target+=nums[i];
        dfs(res,i+1,sub);
    }

    private int getNext(int i) {
        while (nums[i]==nums[i+1]){
            i++;
        }
        return i;
    }


}
