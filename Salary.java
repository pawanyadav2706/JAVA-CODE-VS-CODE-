public class Salary {
    public static void main(String[] args) {
        
    
     int salary = 9000;
    if(salary >25000){
        salary += 3000;
    }
    else if(salary >10000){
        salary += 2000;
    }
    
    else{
        salary += 1000;
    }
    System.out.println(salary);
}
}
