package 树_堆.L373查找和最小的K对数字;

import java.util.*;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((p2, p1) -> p1[0] + p1[1] - p2[0] - p2[1]);

        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            for (int j = 0; j < Math.min(k, nums2.length); j++) {
                if (queue.size() < k) {
                    queue.add(new int[]{nums1[i], nums2[j]});
                } else {
                    if (nums1[i] + nums2[j] < queue.peek()[0] + queue.peek()[1]) {
                        queue.poll();
                        queue.add(new int[]{nums1[i], nums2[j]});
                    }
                }
            }
        }
        LinkedList<List<Integer>> lists = new LinkedList<>();
        while (queue.size() != 0) {
            int[] poll = queue.poll();
            lists.add(Arrays.asList(poll[0], poll[1]));
        }
        return lists;
    }

}
