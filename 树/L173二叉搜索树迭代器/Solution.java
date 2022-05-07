package 树.L173二叉搜索树迭代器;

import 树.TreeNode;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    TreeNode r=null;
    ArrayList list =null;

    int index = 0;
    public void BSTIterator(TreeNode root) {
        list= new ArrayList<Integer>();
        //object转int
//        int i = (int)list.get(0);


        r = root;
        bst(r);
    }
    public TreeNode bst(TreeNode r){
        if(r==null){
            return r;
        }
        bst( r.left);
        list.add(r.val);
        bst( r.right);
        return r;
    }

    public int next() {
        index++;
        return (int) list.get(index);
    }

    public boolean hasNext() {
        return list.get(index+1)!=null;
    }
}
