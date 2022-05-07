package 回溯法.L78子集;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(nums.length==0){
            return result;
        }
        helper(nums,0,new LinkedList<Integer>(),result);
        return result;
    }

    public void helper(int[] nums, int index, LinkedList<Integer> subset, LinkedList<List<Integer>> result){
        if(index==nums.length){
            result.add(new LinkedList(subset));
        }else if (index<nums.length){
            helper(nums,index+1,subset,result);
            subset.add(nums[index]);
            helper(nums,index+1,subset,result);
            subset.removeLast();
        }
    }

}
