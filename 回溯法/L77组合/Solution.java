package 回溯法.L77组合;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }


    int ns;
    int size;

    public List<List<Integer>> combine(int n, int k) {
        ns = n;
        size = k;
        // 在子集的条件下 , 只返回长度为k的数组
        LinkedList<List<Integer>> res = new LinkedList<>();
        dfs(res, 1, new LinkedList<Integer>());
        return res;
    }

    private void dfs(LinkedList<List<Integer>> res, int num, LinkedList<Integer> sub) {
//        if (num==ns+1){
//            if (sub.size()==size){
//                res.add(new LinkedList<>(sub));
//            }
//            return;
//        }
//        sub.add(num);
//        dfs(res,num+1,sub);
//        sub.removeLast();
//        dfs(res,num+1,sub);

        if (sub.size() == size) {
            res.add(new LinkedList<>(sub));
            return;
        }else if (num<=ns){
            sub.add(num);
            dfs(res,num+1,sub);
            sub.removeLast();
            dfs(res,num+1,sub);
        }


    }

}
