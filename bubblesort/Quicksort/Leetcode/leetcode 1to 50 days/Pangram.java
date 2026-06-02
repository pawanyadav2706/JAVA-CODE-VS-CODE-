import java.util.*;
public class Pangram {
    public static void main(String[] args){
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        Solution s = new Solution();
        boolean ans = s.pangram(sentence);
        System.out.println(ans);

    }
}

class Solution{
    public boolean pangram(String sentence){
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
