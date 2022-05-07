package 树.L437路径总和III;

import 树.TreeNode;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);

        TreeNode tree = TreeNode.arrayToTree(new Integer[]{0,1,1});



        System.out.println(pathSum(tree,  1));

    }
    static int sum =0;
    static int path=0;
    public static int pathSum(TreeNode root, int targetSum) {
        if (root==null){
            return 0;
        }
        if(root.left==null&&root.left==null){
            return targetSum;
        }
        sum=targetSum;
        def(root,new ArrayList<Integer>());
        return path;
    }
    public static int def(TreeNode root, ArrayList<Integer> parents){
        if (root==null){
            return 0;
        }
        int s=0;
        int j = 0;
        while (j<parents.size()+1){
            // System.out.println(i);

            for ( int i=j; i < parents.size(); i++) {
                s+= parents.get(i);
            }
            s=s+ root.val;
            //  System.out.println(parents.size());
            // System.out.println(s);
//            if (s!=sum){
//
//                j++;
//                s=0;
//            }else {
//                path++;
////                j=0;
//                break;
//            }

            if (s==sum){
                path++;
            }
            j++;
            s=0;
        }

        ArrayList<Integer> list = new ArrayList<>(parents);
        list.add(root.val);

        def(root.left,list);
        def(root.right,list);
        return 0;
    }
}
