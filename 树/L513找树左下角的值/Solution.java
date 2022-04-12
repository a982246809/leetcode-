package 树.L513找树左下角的值;

import 树.TreeNode;

import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public int findBottomLeftValue(TreeNode root) {
        //一直遍历到最后
        LinkedList<TreeNode> cur = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        cur.add(root);
        int res = root.val;
        while (!cur.isEmpty()){
            TreeNode pop = cur.pop();
            if (pop.left!=null){
                next.add(pop.left);
            }
            if (pop.right!=null){
                next.add(pop.right);
            }
            if (cur.isEmpty()){
                System.out.println();
                if (!next.isEmpty()){
                    res = next.peek().val;
                }
                cur = next;
            }
        }
        return res;
    }
}
