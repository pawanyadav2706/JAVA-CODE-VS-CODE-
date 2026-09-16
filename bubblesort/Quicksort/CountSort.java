import java.util.Arrays;

public class CountSort {
    public static void main(String [] args){
        int [] arr = {2,3,4,1,2,3,4,5,8};
        if(arr == null || arr.length <= 0){
            return;
        }
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int [] countarr = new int[max + 1];
        for(int i = 0; i< arr.length; i++){
            countarr[arr[i]]++;
        }
        int index = 0;
        for(int i = 0; i<countarr.length; i++){
            while(countarr[i] > 0){
                arr[index] = i;
                index++;

                countarr[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
