import java.util.Scanner;

public class Calculator {
    int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}

int add(int a, int b, int c) {
    return a + b + c;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator s2 = new Calculator();
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %):");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } 
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Ans: " + ans);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Exit Calculator.");
                break;
            } else {
                System.out.println("Invalid operation, please try again.");
            }
        }
    }
}
