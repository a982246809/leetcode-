package 树.L729我的日程安排表I;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendar {

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution);
//    }
    TreeMap treeMap=null;
    public MyCalendar() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Map.Entry  s= treeMap.floorEntry(start);
        Map.Entry<Integer, Integer> entry = treeMap.floorEntry(start);
        if (entry!=null && start < entry.getValue()){
            return false;
        }
        entry = treeMap.ceilingEntry(end);
        if (entry!=null && end <= entry.getKey()){
            return false;
        }
        treeMap.put(start,end);
        return true;
    }

}
