public class Calculatoradd {
    int add(int a, int b){
    return a+b;
    }
    int add(int a, int b, int c){
    return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
     double add(double a, int b){
        return a+b;
    }
      double add(int a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        Calculatoradd sc = new Calculatoradd();
        System.out.println("add(int a, int b): " + sc.add(10, 20));
        System.out.println("add(int a, int b, int c): " + sc.add(10, 20, 30));
        System.out.println("add(double a, double b): " + sc.add(3.5, 2.5));
        System.out.println("add(double a, int b): " + sc.add(3.5, 15));
        System.out.println("add(int a, double b): " + sc.add(20, 2.5));
    }
}
