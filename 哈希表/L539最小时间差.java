package 哈希表;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        Boolean[] booleans = new Boolean[1440];

        for (String t : timePoints) {
            String[] split = t.split(":");
            int minute = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            booleans[minute] = true;
        }
//用于和当前的index 相减
        int pre = -1;
        int min = 1440;
        int first = -1;
        int last = -1;

        for (int i = 0; i < booleans.length; i++) {

            if (booleans[i]) {

                if (pre > 0) {
                    min = Math.min(min, i - pre);
                } else {
                    first = i;
                }

                last = i;
                pre = i;
            }
        }
        min = Math.min(min,first+1440-last);
        return min;
    }
}