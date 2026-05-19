import java.util.Scanner;
import java.util.Stack;

public class Reverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
        String input = sc.nextLine();

		Stack<Character> stack = new Stack<>();
		for(int i =0;i<input.length();i++){
		    stack.push(input.charAt(i));
		}
		String reversed ="";

		for(int i =0;i<input.length();i++){
			reversed = reversed + stack.pop();  
		}
		System.out.println("reversed string="  +   reversed);
		
	}
}
