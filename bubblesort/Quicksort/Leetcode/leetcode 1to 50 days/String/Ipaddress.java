import java.util.*;
public class Ipaddress {
    public static void main(String[] args){
        String address = "1.1.1.1";
        Solution sol = new Solution();
        System.out.println(sol.isipaddress(address));

    }
}

// 1108. Defanging an IP Address LeetCode
class Solution{
    public String isipaddress(String address){
        return address.replace(".", "[.]");
    }
}
