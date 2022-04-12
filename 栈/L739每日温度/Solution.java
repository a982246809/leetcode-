package 栈.L739每日温度;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }
    public int[] dailyTemperatures(int[] temperatures) {
        //暴力  双循环可以直接求解
        //尝试优化, 就需要把前面遍历过的缓存起来
        //这里每次当前值, 都要和最近的值相比
        //根据先进后出 , 可以栈缓存
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        int j = 0;
        for (int i = 0; i < temperatures.length; i++) {
            int cur = temperatures[i];
            while (stack.size()!=0&&stack.peek()[0]<cur){
                    res[stack.peek()[1]] = i - stack.peek()[1];
                    stack.pop();
                    j++;
            }
//            stack.
            if (stack.size()==0 || (stack.size()!=0&&stack.peek()[0]>=cur)){
                stack.push(new int[]{temperatures[i], i});
            }

        }
        return  res;
    }
}
