package 栈.L735行星碰撞;

import java.util.ListIterator;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.asteroidCollision(new int[]{1,-2,-2,-2}).toString());
    }
    public int[] asteroidCollision(int[] asteroids) {
        //存入一个容器 , 当前值 , 要与容器最近的比
        //所以栈
        Stack<Integer> stack = new Stack<>();
        for (int cur :
                asteroids) {

            if (stack.size()==0){
                stack.push(cur);
                continue;
            }
            Integer peek = stack.peek();
            //判断是否是  正负数
            if (peek>0&&cur<0 ){
//                循环栈, 看能否击穿
                while (peek>0&&cur<0 ){
                    if ( Math.abs(peek)< Math.abs(cur) && stack.size()!=0){
                        stack.pop();
                        if (stack.size()>0){
                            peek = stack.peek();
                        }else {
                            stack.push(cur);
                            break;
                        }

                        if (peek<0){
                            stack.push(cur);
                            break;
                        }
                        continue;
                    }else if (Math.abs(peek)> Math.abs(cur)){
                        break;
                    }
                    else if (stack.size()==0){
                        stack.push(cur);
                        break;
                    }else if ( Math.abs(peek)==Math.abs(cur)){
                        stack.pop();
                        break;
                    }
                }
            }else {
                stack.push(cur);
            }



        }
        //Stack into Array order same as input

        return stack.stream().mapToInt(i->i).toArray();
    }
}
