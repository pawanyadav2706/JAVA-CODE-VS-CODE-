public class Palindrome {
    public static void main(String[] args){
        int num = 121;
        int original = num;
        int reverse = 0;
        while(num > 0){
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        if(original ==reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
