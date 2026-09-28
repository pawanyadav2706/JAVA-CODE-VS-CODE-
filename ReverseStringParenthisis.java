import java.util.*;
public class ReverseStringParenthisis {
    public static void main(String [] args){
        String s = "(u(love)i)";

        Solution sol = new Solution();
        System.out.println(sol.reverseParentheses(s));
    }
}
class Solution {
     public String reverseParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                StringBuilder temp = new StringBuilder();
                while (stack.peek() != '(') {
                    temp.append(stack.pop());
                }
                stack.pop();
                // reverse string ko fir se stack me dal do 
                for(char c : temp.toString().toCharArray()){
                    stack.push(c);
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.empty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
     }
}
