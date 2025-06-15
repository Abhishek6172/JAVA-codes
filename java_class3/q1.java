package JAVA.java_class3;


import java.util.*;

class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    double volume() {
        return length * width * height;
    }
}
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Box box = new Box(l, w, h);
        double vol = box.volume();

        System.out.println("Volume of the box: " + vol);
        System.out.println();
    }
}
