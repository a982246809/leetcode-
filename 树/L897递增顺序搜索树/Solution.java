package 树.L897递增顺序搜索树;

import 树.TreeNode;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
        TreeNode tree = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,7,9});
        System.out.println(increasingBST(tree));
    }
    static TreeNode p = new TreeNode();
    public static TreeNode increasingBST(TreeNode root) {
        // 在中序遍历的过程中改变节点指向
        // 需要一个哨兵节点

        bfs(root,p);
        return p.right;
    }
    public static TreeNode bfs(TreeNode root, TreeNode pre){
        if(root==null){
            return null;
        }

        bfs(root.left,pre);
        pre.right = root;
        pre = root;
        bfs(root.right,pre);
        return root;
    }

}
