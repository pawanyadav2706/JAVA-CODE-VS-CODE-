
import java.util.*;
public class MultiplyStrings {
	public static void main(String [] args) {
//		String num1 = "2";
//		String num2 = "3";
		String num1 = "123";
		String num2 = "456";
		Solution48 sol = new Solution48();
		System.out.println(sol.ismultiplystring(num1, num2));
	}
}
//43. Multiply Strings leetcode
// https://leetcode.com/problems/multiply-strings/description/

class Solution48{
	public String ismultiplystring(String num1, String num2) {
		if(num1.equals("0") || num2.equals("0")) {
			return "0";
		} // agar yadi num1 or num2 dono me se koy ek zero raha to wo ans 0 kar dega, nahi to next step; 
		
		int m = num1.length();
		int n = num2.length();
		int[] result  = new int [m + n];
		
		for(int i = m-1; i>=0; i--) {
			for(int j = n-1; j>=0; j--) {
				int mul = (num1.charAt(i)- '0') * (num2.charAt(j)-'0');
				
				int p1 = i + j;
				int p2 = i + j + 1;
				int sum = mul + result[p2];
				
				result[p2] = sum % 10;
				result[p1] += sum / 10;
			}
		}
		StringBuilder ans = new StringBuilder();
		for(int num: result) {
			if(!(ans.length()==0 && num == 0)) {
				ans.append(num);
			}
		}
		return ans.toString();
	}
}
