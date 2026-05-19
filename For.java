import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        // print 1 to five number
        // for( int num = 1; num<= 5; num++){
        //     System.out.println(num);
        // }

         // print 1 to n number
         Scanner s1 = new Scanner(System.in);
          System.out.println("enter the number");
         int n = s1.nextInt();
           for( int num = 1; num<= n; num++){
             System.out.println(num);
        }

    }
    
}
