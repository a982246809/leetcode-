package 回溯法.L47全排列II;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

//    public Stack<Integer> stack = new Stack();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        LinkedList<List<Integer>> res = new LinkedList<>();
        dfs(nums,res,0,new LinkedList<Integer>(),new boolean[nums.length]);
        return res;
    }

    private void dfs(int[] nums, LinkedList<List<Integer>> res, int depth, LinkedList<Integer> paths, boolean[] used) {
        if (depth==nums.length){
            res.add(new LinkedList<>(paths));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //上一个节点 的 used被撤销 , 就剪纸
            if (used[i] || (i>0&&nums[i]==nums[i-1]&&!used[i-1])){
                continue;
            }
//            if (stack.size()!=0&&nums[i]==stack.peek()){
//                return;
//            }
            paths.add(nums[i]);
            used[i]=true;
            dfs(nums,res,depth+1,paths,used);
            Integer last = paths.removeLast();
//            stack.add(last);
            used[i]=false;
        }
    }

}
