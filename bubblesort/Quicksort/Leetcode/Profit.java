 import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of days: ");

        int n = sc.nextInt();

        int balance = 0;
        int maxBalance = 0;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            balance = balance + a;

            if(balance > maxBalance) {
                maxBalance = balance;
            }
        }

        System.out.println("the max balence is of the = "+maxBalance);
    }
}

