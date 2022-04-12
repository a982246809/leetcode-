import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        int minSubArrayLen = numSubarrayProductLessThanK(new int[]{3,4,7,2,-3,1,4,2},7);
        System.out.println(minSubArrayLen);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        // key：前缀和，value：key 对应的前缀和的个数
        Map<Integer, Integer> preSumFreq = new HashMap<>();
        // 对于下标为 0 的元素，前缀和为 0，个数为 1  前0项和的个数
        preSumFreq.put(0, 1);

        int preSum = 0;
        int count = 0;
        for (int num : nums) {
            preSum += num;

            // 先获得前缀和为 preSum - k 的个数，加到计数变量里
            if (preSumFreq.containsKey(preSum - k)) {
                count += preSumFreq.get(preSum - k);
            }

            // 然后维护 preSumFreq 的定义  意思就是当Map集合中有这个key时，就使用这个key对应的value值，如果没有就使用默认值defaultValue
            preSumFreq.put(preSum, preSumFreq.getOrDefault(preSum, 0) + 1);
        }
        return count;

    }
}
