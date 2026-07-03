public class Stringcheckword {
    public static void main(String[] args) {
        String [] patterns = {"a", "b", "c"};
        String word = "a";
        Solution sol = new Solution();
        int result = sol.checkStringword(patterns, word);
        System.out.println(result);
    }
}

class Solution{
    public int checkStringword(String [] patterns, String word){
        int count = 0;
        for(String pattern: patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
}
