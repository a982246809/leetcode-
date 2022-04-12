package 树.L814二叉树剪枝;

import 树.TreeNode;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public TreeNode pruneTree(TreeNode root) {
        if (root==null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right  =  pruneTree(root.right);
        if ( root.left==null&&root.right==null&&root.val==0){
            return null;
        }
        return root;
    }

//    public TreeNode pruneTree(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode p = root;
//        TreeNode pre = null;
//        while (p!=null||!stack.isEmpty()){
//            while(p!=null){
//                stack.add(p);
//                pre = p;
//                p=p.left;
//            }
//            if(stack.peek().right!=null&&stack.peek().right!=pre){
//                p=p.right;
//            }else {
//                TreeNode pop = stack.pop();
//                System.out.println(pop.val);
//            }
//
//        }
//        return p;
//    }
}
