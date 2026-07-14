import java.util.*;
public class DecimalToBinary {
    public static void main(String [] args){
        int n = 10;
        Soluiton sol = new Soluiton();
        System.out.println(sol.decTobinary(n));
    }
}
class Soluiton{
    public String decTobinary(int n){
        if(n == 0){
            return "0";
        }
        String ans = "";
        while(n > 0){
            int rem  = n %  2;
            ans = rem + ans;
            n = n / 2;
        }
        return ans;
    }
}
