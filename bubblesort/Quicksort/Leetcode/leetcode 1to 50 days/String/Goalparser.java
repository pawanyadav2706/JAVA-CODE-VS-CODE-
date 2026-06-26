
import java.util.*;
public class Goalparser {
    public static void main(String[] args){
        String command = "G()()()(al)";
        Solution sol = new Solution();
        System.out.println(sol.goalparser(command));
    }
}
class Solution{
    public String goalparser(String command){
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans.append("o");
                i++;
            }else{
                ans.append("al");
                i = i+3;
            }
        }
        return ans.toString();
    }
}
