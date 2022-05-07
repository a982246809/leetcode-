package 回溯法.L131分割回文串;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("efe"));
    }

    String s;

    public List<List<String>> partition(String s) {
        this.s = s;
        LinkedList<List<String>> res = new LinkedList<>();
        backtrack(res, new LinkedList<String>(), 0);
        return res;
    }

    private void backtrack(LinkedList<List<String>> res, LinkedList<String> paths, int depth) {
        if (depth == s.length()) {
            res.add(new LinkedList<>(paths));
            return;
        }
//        paths.add(String.valueOf(s.charAt(i)));
//        backtrack(res,paths,0);
//        paths.removeLast();

        for (int j = depth; j < s.length() ; j++) {
            if (isBackStr(s.substring(depth,j+1))) {
                paths.add(s.substring(depth,j+1));
                backtrack(res, paths, j+1);
                paths.removeLast();
            }
        }
    }

    private boolean isBackStr(String str) {
        int l =0;
        int r = str.length()-1;
       while (l<=r){
           if (str.charAt(l)!=str.charAt(r)){
               return false;
           }
           l++;
           r--;
       }
       return true;
    }

}
