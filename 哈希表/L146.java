package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class L146 {
    public Map map=null;
    public int cap=0;
    public ListNode list = new ListNode();
    public L146(int capacity) {
        map = new HashMap();
        cap = capacity;
    }

    public int get(int key) {
       if (map.get(key)!=null){
           return  key;
       }
       return -1;
    }

    public void put(int key, int value) {
        list.val = key;
        list = list.next;
        if (map.size()==cap){

        }

    }
}
