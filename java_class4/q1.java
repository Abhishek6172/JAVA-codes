package JAVA.java_class4;
class Shape2D{
    double length, width;
    final double cost2 = 40;

    Shape2D( double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea() {
        return length * width;
    }
    double calcCost1() {
        return getArea() * cost2;
    }
}
class Shape3D extends Shape2D {
    double height;
    final double cost3 = 60;
    Shape3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    double getVolume() {
        return getArea() * height;
    }
    double calcCost2() {
        return getVolume() * cost3;
    }
}/* 
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and width of the 2D sheet in feet: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Shape2D sheet = new Shape2D(length, width);
        System.out.println("Cost of 2D sheet: Rs " + sheet.calcCost1());

        System.out.print("Enter the length, width, and height of the 3D box in feet: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
        double height = sc.nextDouble();
        Shape3D box = new Shape3D(length, width, height);
        System.out.println("Cost of 3D box: Rs " + box.calcCost2());
    }

}*/