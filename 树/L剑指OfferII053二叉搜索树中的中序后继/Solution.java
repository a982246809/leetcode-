package 树.L剑指OfferII053二叉搜索树中的中序后继;

import 树.TreeNode;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
        TreeNode tree = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,null,1});
        System.out.println(inorderSuccessor(tree,  new TreeNode(6)));
    }


    static TreeNode res=null;
    static boolean flag =false;
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root,p);
        return res;
    }
    public static TreeNode dfs(TreeNode root, TreeNode p){
        if(root==null){
            return null;
        }
        dfs(root.left,p);

        if(flag){
            res = root;
            flag=false;
        }
        if(root.val==p.val){
            flag = true;
        }
        dfs(root.right,p);
        return null;
    }
}
