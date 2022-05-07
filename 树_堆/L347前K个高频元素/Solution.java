package 树_堆.L347前K个高频元素;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3},  2)[0]);
        System.out.println(topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3},  2)[1]);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((v1,v2)->v1.getValue()- v2.getValue());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        //把map中的值  遍历到 堆中
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer, Integer> item:map.entrySet()){
            if (queue.size()<k){
                queue.add(item);

            }else {
                if (item.getValue()>queue.peek().getValue()){
                    queue.remove();
                    queue.add(item);
                }

            }

        }

        return   queue.stream().mapToInt(item->item.getKey()).toArray();
    }
}
