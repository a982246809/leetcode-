package 队列.L剑指OfferII041滑动窗口的平均值;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.next(2));
    }
    ArrayQueue<Integer> queue=null;
    /** Initialize your data structure here. */
    public void MovingAverage(int size) {
        queue = new ArrayQueue<Integer>(3);
        LinkedList<Integer> integers = new LinkedList<>();
        //遍历LinkedList
//        integers.ge
    }

    public double next(int val) {
        queue.add(val);
        int sum = 0;
        for (int q: queue) {
            sum+=q  ;
        }
//        for (int i = 0; i < ; i++) {
//
//        }
        return sum/queue.size();
    }
}
