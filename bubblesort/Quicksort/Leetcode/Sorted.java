public class Sorted {
    public static void main(String[]args){
        int[] arr = {1,2,4,7,10,14,29};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[]arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index + 1]){
            return false;
        }
        return sorted(arr, index + 1);
    }
}
