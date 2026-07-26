import java.util.*;
public class Validparent {
    public static void main(String [] args){
        // String s = "({[]})";
         String s = "({)}";
        Solution sol = new Solution();
        System.out.println(sol.isvalidparentheses(s));
    }
}
class Solution{
    public boolean isvalidparentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
