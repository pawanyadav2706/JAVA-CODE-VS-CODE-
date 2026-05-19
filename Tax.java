import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        System.out.print("Enter your gender (Male/Female): ");
        String gender = sc.next();

        double tax = 0;

        // For Male (General)
        if (gender.equalsIgnoreCase("Male")) {
            if (income <= 180000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 180000) * 0.10;
            } else if (income <= 800000) {
                tax = (500000 - 180000) * 0.10 + (income - 500000) * 0.20;
            } else {
                tax = (500000 - 180000) * 0.10 + (800000 - 500000) * 0.20 + (income - 800000) * 0.30;
            }
        }

        // For Female
        else if (gender.equalsIgnoreCase("Female")) {
            if (income <= 190000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 190000) * 0.10;
            } else if (income <= 800000) {
                tax = (500000 - 190000) * 0.10 + (income - 500000) * 0.20;
            } else {
                tax = (500000 - 190000) * 0.10 + (800000 - 500000) * 0.20 + (income - 800000) * 0.30;
            }
        }

        // Invalid gender
        else {
            System.out.println("Invalid gender entered.");
            return;
        }

        // Print final tax
        System.out.println("Your calculated tax is: ₹" + tax);
    }
}
