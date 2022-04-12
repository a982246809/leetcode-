package 字符串.L647回文子串;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public int countSubstrings(String s) {
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            //两个指针像两边延伸  如果相等 则继续延伸
            count = computeCount(i, i, s)+count;
            count = computeCount(i, i+1, s)+count;
        }
        return count;
    }
    public int computeCount(int l,int r,String s){
        int count = 0;
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}
