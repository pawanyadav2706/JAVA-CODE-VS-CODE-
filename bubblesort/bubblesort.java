package bubblesort;
import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] =temp;
                }
            }
        }
    }
}
