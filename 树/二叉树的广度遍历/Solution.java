package 树.二叉树的广度遍历;

import 树.TreeNode;

import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public void bfs(TreeNode node){
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(node);
        while (list.size()!=0){
            TreeNode n = list.pop();
            System.out.println(node.val);
            if (n.left!=null){
                list.add(n.left);
            }
            if (n.right!=null){
                list.add(n.right);
            }
        }
    }

}
