import java.util.*;
public class Excelsheetcoolumntitle {
    public static void main(String[] args){
        int columnNumber = 26;
        Solution sol = new Solution();
        String result = sol.converttotitle(columnNumber);
        System.out.println(result);
    }
}
class Solution{
    public String converttotitle(int columnNumber){
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            columnNumber --;

            sb.append((char) ('A' + (columnNumber % 26)));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}
