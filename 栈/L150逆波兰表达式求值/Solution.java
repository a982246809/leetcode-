package 栈.L150逆波兰表达式求值;

import java.util.Stack;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
            return Integer.parseInt(tokens[1]);
        }

        Stack<Integer> stack = new Stack<>();
        int value=0 ;
        for (int i = 0; i < tokens.length; i++) {
            // 判断是否是数字  将数字推入栈
            if(tokens[i].matches("[-]?[0-9]+")){
                stack.push(Integer.parseInt(tokens[i]));
            }else {
//                否则取出两个元素 进行计算
                Integer x = stack.pop();
                Integer y = stack.pop();
//                +、-、*、/
                if (tokens[i].equals("+")){
                    value = x+y;
                }else if (tokens[i].equals("-")){
                    value = x-y;
                }else if (tokens[i].equals("*")){
                    value = x*y;
                }else if (tokens[i].equals("/")){
                    value =y/x;
                }
                stack.push(value);
            }
        }
        return value;
    }
}
