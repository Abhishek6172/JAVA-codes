package JAVA.java_class3;

import java.util.*;

class Rect {
    double length, breadth;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }       
    void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        calculate();
    }
}
public class q2 {
    public static void main(String[] args) {
        Rect rectangle = new Rect();
        rectangle.read();
        rectangle.display();
    }
}
