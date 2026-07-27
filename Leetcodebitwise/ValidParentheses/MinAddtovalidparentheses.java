import java.util.*;
public class MinAddtovalidparentheses {
    public static void main(String [] args){
        String s = "(((";
        Solution sol = new Solution();
        System.out.println(sol.isminaddtovalid(s));
    }
}
class Solution{
    public int isminaddtovalid(String s){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    count++;
                }
                stack.pop();
            }
        }
        return count + stack.size();
    }
}
