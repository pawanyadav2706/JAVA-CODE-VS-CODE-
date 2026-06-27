import java.util.*;
public class CheckStringarrayqual{
    public static void main(String[] args){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        Solution sol = new Solution();
        System.out.println(sol.arrayStringsAreEqual(word1, word2));
    }
}
class Solution{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String str: word1){
            s1.append(str);
        }
        for(String str: word2){
            s2.append(str);
        }
        return s1.toString().equals(s2.toString());
    }
}