package 树.L515在每个树行中找最大值;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }


    public List<Integer> largestValues(TreeNode root) {
        LinkedList<TreeNode> cur = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        res.add(root.val);
        cur.add(root);
        int max= Integer.MIN_VALUE;
        while (!cur.isEmpty()){
            TreeNode pop = cur.pop();


            if (pop.left!=null){
                next.add(pop.left);
                max =  Math.max(pop.left.val, max);
            }
            if (pop.right!=null){
                next.add(pop.right);
                max =  Math.max(pop.right.val, max);
            }

            if(cur.isEmpty()){
                if (next.isEmpty()){
                    break;
                }
                cur = next;
                next.clear();
                res.add(max);
                max= Integer.MIN_VALUE;
            }
        }
        return  res;
    }

//    public List<Integer> largestValues(TreeNode root) {
////        需要知道没层什么时候开始 , 什么时候结束
//        //用两个变量记录 当前层  和下一层的节点数 , 当cur为0 ; 就是下一层
//        LinkedList<TreeNode> list = new LinkedList<>();
//        ArrayList<Integer> res = new ArrayList<>();
//        res.add(root.val);
//        list.add(root);
//        int cur = 1;
//        int next = 0;
//        Integer.MIN_VALUE
//        while (!list.isEmpty()){
//            TreeNode pop = list.pop();
//            cur--;
//            if (pop.left!=null){
//                list.add(pop.left);
//                next++;
//            }
//            if (pop.right!=null){
//                list.add(pop.right);
//                next++;
//            }
//            if (cur==0){
//                int max= 0;
//                cur= next;
//                for (int i = 0; i < cur; i++) {
//                  max =  Math.max(list.get(i).val,max);
//                }
//                res.add(max);
//            }
//        }
//        return  res;
//    }

}
