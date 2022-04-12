package 字符串.L680验证回文字符串Ⅱ;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
    public boolean validPalindrome(String s) {
        int length = s.length();

        int l=0,r=length-1;
        boolean hasDel=false;
        while (l<r){
            if (s.charAt(l)!=s.charAt(r)){
                if (l==r-1){
                    return true;
                }
                if (s.charAt(l+1)==s.charAt(r)&&isPalindrome(l+1,r,s)){
                    if (hasDel){
                        return false;
                    }
                    hasDel=true;
                    l++;

                }else if (s.charAt(l)==s.charAt(r-1)){
                    if (hasDel){
                        return false;
                    }
                    hasDel=true;
                    r--;
                }else {
                    return false;
                }

            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindrome(int l,int r,String s) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
