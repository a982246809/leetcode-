package 字符串.L125验证回文串;

public class L125验证回文串 {


    public static void main(String[] args) {
        L125验证回文串 solution = new L125验证回文串();
        boolean amanaplanacanalpanama = solution.isPalindrome( "A man, a plan, a canal: Panama");
        System.out.println(amanaplanacanalpanama);
    }


    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length()-1;
        System.out.println(r);
        boolean flag = true;
        while (r-l>1){
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if (!Character.isLetterOrDigit(cl)){
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(cr)){
                r--;
                continue;
            }
             cl = Character.toLowerCase(cl);
            cr = Character.toLowerCase(cr);
            if (cl!=cr){
                flag = false;
            }
            r--;
            l++;
        }
        return flag;
    }
}
