import java.util.Arrays;
public class Passingfunction {
    public static void main(String[] args) {
        int [] nums = {3,4,85,4,5,};
        System.out.println(Arrays.toString(nums));
        Change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void Change (int[] arr){
        arr[2] = 67;
    }

    }

