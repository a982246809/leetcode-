package 字符串.L3无重复字符的最长子串;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println( solution.lengthOfLongestSubstring("tmmzuxt"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        int l = 0, r = 0;
        do {
            if (map.get(s.charAt(r)) == null||map.get(s.charAt(r))<l) {
                max = Math.max(r - l + 1, max);
                map.put(s.charAt(r), r);
                r++;
            } else {

                l = map.get(s.charAt(r)) + 1;
                map.put(s.charAt(r), r);
                r++;
            }
        } while (r < s.length());
        return max;
    }

}
