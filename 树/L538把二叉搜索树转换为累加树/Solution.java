package 树.L538把二叉搜索树转换为累加树;

import 树.TreeNode;

public class Solution {



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
        TreeNode tree = TreeNode.arrayToTree(new Integer[]{4,1,6,0,2,5,7,null,null,null,3,null,null,null,8});
        System.out.println(convertBST(tree));
    }

    private static int acc=0;
    public static TreeNode convertBST(TreeNode root) {

        int sum =  bst(root);
        acc=0;
        bst2(root,sum);
        return root;
    }
    public static int bst(TreeNode root){
        if(root==null){
            return 0;
        }
        bst(root.left);
        acc+= root.val;
        bst(root.right);
        return acc;
    }
    public static int bst2(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
         bst2(root.left,acc);
        int cache = acc;
        acc+= root.val;
        root.val = cache;
         bst2(root.right,acc);
        return acc;
    }

}
