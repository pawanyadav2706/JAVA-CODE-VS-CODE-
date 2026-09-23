public class Rangetosum {
    public static void main(String[] args){
        int [] arr ={1,3,5,6,8};
        int left = 1;
        int right = 4;

        int sum = 0;
        for(int i =left; i<=right; i++){
            sum = sum + arr[i];
            System.out.println(sum);
        } 
    }
}
