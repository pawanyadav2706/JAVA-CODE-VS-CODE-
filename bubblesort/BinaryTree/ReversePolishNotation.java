import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String [] args){
        // String [] tokens = {"2","1","+","3","*"};
        String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution sol = new Solution();
        System.out.println(sol.evalRPN(tokens));
    }
}
class Solution {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")){
                    int b = stack.pop();
                    int a = stack.pop();

                    if(token.equals("+")){
                        stack.push(a + b);
                    }else if(token.equals("-")){
                        stack.push(a - b);
                    }else if (token.equals("*")){
                        stack.push(a * b);
                    }else {
                        stack.push(a / b);
                    }
                }else {
                    stack.push(Integer.parseInt(token));
                }
        }
        return stack.pop();
    }
}
