package 树.L653两数之和IV输入BST;

import 树.TreeNode;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
        TreeNode tree = TreeNode.arrayToTree(new Integer[]{5,3,6,2,4,null,7});
        System.out.println(findTarget(tree,9));
    }
    public static boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        while(root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.add(root);
                root=root.left;
            }
            TreeNode pop = stack.pop();
            if (map.get(k- pop.val)!=null){
                return true;
            }
            map.put(pop.val,1);
            root=pop.right;
        }
        return false;
    }

//    public TreeNode bfs(TreeNode cur,int k,HashMap map){
//
//        bfs(cur.left, k , map)
//        if(map.get(k-cur.val)!=null){
//            return
//        }
//        map.add(cur.val);
//
//        bfs(cur.right, k , map)
//    }
}
