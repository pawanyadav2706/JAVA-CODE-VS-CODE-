
import java.util.*;
public class Nums {
    public static void main(String[] args) {
        int num = 41;
        Nums solution = new Nums();
        System.out.println(solution.numOfSteps(num));
    }
    public int numOfSteps(int num){
        return helper(num,0);
    }
    private int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num /2 , steps+1);
        }
        return helper(num-1, steps+1);
    }
}
