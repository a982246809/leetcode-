package 字符串;

import java.util.ArrayList;
import java.util.List;

class L438找到字符串中所有字母异位词 {
    public static void main(String[] args) {
        new s2().findAnagrams( "cbaebabacd", "abc");
    }
}
class s2{
    public List<Integer> findAnagrams(String s, String p) {
        int[] ints = new int[26];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            ints[p.charAt(i)-'a']++;
            ints[s.charAt(i)-'a']--;
        }
        if (isZero(ints)){
            res.add(0);
        }

        //滑动窗口
        int l=0,r=p.length()-1;
        while (r<s.length()-1){
            ints[p.charAt(l)-'a']++;
            l++;
            r++;
            ints[p.charAt(r)-'a']--;
            if (isZero(ints)){
                res.add(l);
            }
        }
        return res;
    }
    public static boolean isZero(int[] ints){
        boolean isZero = true;
        for (int v:  ints
        ) {
            if (v!=0){
                isZero=false;
            }
        }
        if (isZero){
            return true;
        }
        return  false;
    }
}



