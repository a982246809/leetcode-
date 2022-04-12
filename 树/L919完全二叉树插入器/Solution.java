package 树.L919完全二叉树插入器;

import 树.TreeNode;

import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    class CBTInserter {
        TreeNode r =null;
        LinkedList<TreeNode> list;
        public CBTInserter(TreeNode root) {
            r = root;
            list = new LinkedList<>();
            list.add(root);
            //左右节点都有的话 , 就不在考虑范围
            while (list.peek().left!=null&&list.peek().right!=null){
                TreeNode pop = list.pop();
                list.add(pop.left);
                list.add(pop.right);
            }
        }

        public int insert(int val) {
            TreeNode node = new TreeNode(val);
            TreeNode peek = list.peek();
            if (peek.left==null){
                peek.left = node;
                return peek.val;
            }
            if (peek.right==null){
                peek.right = node;
                //这个时候左右都有 , 就把她排除队列
                TreeNode pop = list.pop();
                list.add(pop.left);
                list.add(pop.right);
                return list.peek().val;
            }
            return peek.val;
        }

        public TreeNode get_root() {
            return r;
        }
    }

//    class CBTInserter {
//        TreeNode r =null;
//        LinkedList<TreeNode> list;
//        public CBTInserter(TreeNode root) {
//            r = root;
//           list = new LinkedList<>();
//            list.add(root);
//        }
//
//        public int insert(int val) {
//            TreeNode node = new TreeNode(val);
//            while (!list.isEmpty()){
//                TreeNode pop = list.pop();
//                if (pop.left!=null){
//                    list.add(pop.left);
//                }else {
//                    pop.left = node;
//                    return pop.val;
//                }
//                if (pop.right!=null){
//                    list.add(pop.right);
//                }else {
//                    pop.right = node;
//                    return pop.val;
//                }
//            }
//            return 0;
//        }
//
//        public TreeNode get_root() {
//            return r;
//        }
//    }

}
