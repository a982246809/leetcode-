package 树.L199二叉树的右视图;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<TreeNode> cur = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        cur.add(root);
        res.add(root.val);
        while (!cur.isEmpty()){

            TreeNode pop = cur.pop();


            if (pop.left!=null){
                next.add(pop.left);

            }
            if (pop.right!=null){
                next.add(pop.right);

            }

            if(cur.isEmpty()){
                if (next.isEmpty()){
                    break;
                }
                res.add(next.getLast().val);
                cur = next;
                next =  new LinkedList<>();

            }
        }
        return  res;
    }

}
