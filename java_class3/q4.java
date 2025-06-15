package JAVA.java_class3;
class Calc {
    int sub(int a, int b) {
        return a - b;
    }
    int sub(int a, int b, int c) {
        return a - b - c;
    }
    double sub(double a, double b) {
        return a - b;
    }
    double sub(int a, double b) {
        return a - b;
    }
    double sub(double a, int b) {
        return a - b;
    } 
}
public class q4 {
    public static void main(String[] args) {
        Calc calculate = new Calc();
        System.out.println(calculate.sub(10, 5));
        System.out.println(calculate.sub(10, 5, 3));
        System.out.println(calculate.sub(10.5,2.3));
        System.out.println(calculate.sub(2,5.5));
        System.out.println(calculate.sub(5.5,5));
       

    }
}
