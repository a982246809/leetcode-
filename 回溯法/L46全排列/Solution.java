package 回溯法.L46全排列;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        int len = nums.length;
        dfs(nums,len,0,new LinkedList<Integer>(),new boolean[len],res);
        return res;
    }

    private void dfs(int[] nums, int length, int depth, LinkedList<Integer> paths, boolean[] used, LinkedList<List<Integer>> res) {
        if (depth==nums.length){
            res.add(new LinkedList<>(paths) );
            return;
        }
        for (int i = 0; i < length; i++) {
//            在深度遍历时
            if (used[i]){
                continue;
            }
            paths.add(nums[i]);
            used[i]=true;
            dfs(nums,length,depth+1,paths,used,res);
//            执行完就回溯 , 重置状态
            used[i]=false;
            paths.removeLast();
        }
    }



}
