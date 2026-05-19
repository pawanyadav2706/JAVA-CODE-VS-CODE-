// write a program to find unique two digit number in an array of repeating number.
import java.util.HashSet;
import java.util.Set;

public class  Uniquenumber{
    public static void main(String[] args) {
        int[] numbers = {7, 4, 3, 1, 5, 3, 4, 7};
        findUniqueNumbers(numbers);
    }

    public static void findUniqueNumbers(int[] arr) {
        Set<Integer> uniq = new HashSet<>();

        for (int num : arr) {
            if (uniq.contains(num)) {
            
                uniq.remove(num);
            } else {
                
                uniq.add(num);
            }
        }

        System.out.println("Unique numbers in the array:");
        for (int c : uniq) {
            System.out.println(c);
        }
    }
}
