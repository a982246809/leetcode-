package 树_堆.L703数据流中的第K大元素;

import java.util.PriorityQueue;

public class KthLargest {
    public PriorityQueue<Integer> queue = null;
    int max;
    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<Integer>();
        max = k;
        //堆size 也就是k

    }

    public int add(int val) {
        if (max>queue.size()){
            queue.add(val);
        }else if (val>queue.peek()){
            queue.remove();
            queue.add(val);
        }

        return queue.peek();
    }

}
