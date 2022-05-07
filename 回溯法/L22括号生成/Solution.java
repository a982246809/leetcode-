package 回溯法.L22括号生成;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    int n ;
    public List<String> generateParenthesis(int count) {
        n=count;
        // 2n步 , 每步要么是 左口号 要么是又括号
        //两个限制
        //1 左括号和有括号 数目不超过n
        //2 现有的括号中  右括号不能超过左括号的数目

        LinkedList<String> res = new LinkedList<>();
        dfs(res,"",0,0,0);
        return res;
    }

    private void dfs(LinkedList<String> res, String s, int depth,int l,int r) {
        if (l<r){
            return;
        }
        if (depth==n){
            res.add(s.substring(0));
            return;
        }
        s = s + '(';
        dfs(res,s,depth+1,l+1,r);
        s= s.substring(0,s.length()-1);
        s = s+')';
        dfs(res,s,depth+1,l,r+1);
    }

}
