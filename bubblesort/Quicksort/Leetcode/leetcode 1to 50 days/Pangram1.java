import java.util.*;
public class Pangram1 {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Solution1 s = new Solution1();
        s.pangram(sentence);
    }
}

class Solution1{
    public boolean pangram(String sentence){
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
            if(set.size() == 26){
                System.out.println("pangram");
                return true;
            }else{
                System.out.println("not pangram");
                return false;
            }
        }
}

    

