import java.util.*;
public class FindoccurenceString {
    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        Solution sol = new Solution();
        System.out.println(sol.strStr(haystack, needle));
    }
}
class  Solution{
    public int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
