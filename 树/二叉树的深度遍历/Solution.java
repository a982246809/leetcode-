package 树.二叉树的深度遍历;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    //前序
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode p = root;
        while (p!=null||!nodes.isEmpty()){
            while (p!=null){
                nodes.add(p);
                p=p.left;
            }
            TreeNode pop = nodes.pop();
            res.add(pop.val);
            p=pop.right;
        }
        return res;
    }
//    递归
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ArrayList<Integer> res = new ArrayList<>();
//        preorder(root,res);
//        return res;
//    }
//    public void preorder(TreeNode node, ArrayList<Integer> res){
//        if (node==null){
//            return;
//        }
//        preorder(node.left,res);
//        res.add(node.val);
//        preorder(node.right,res);
//    }

}
