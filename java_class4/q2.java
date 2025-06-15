package JAVA.java_class4;
 class Plate {
    private double Length;
    private double width;

    Plate(double Length, double Width) {
        this.Length = Length;
        this.width = Width;
        System.out.println("Plate constructor");
        System.out.println("Length: " + Length + ", Width: " + Width);
        System.out.println();
    }
}
class Box extends Plate {
    double height;
    Box(double length, double width, double height) {
        super(length, width); 
        this.height = height;
        System.out.println("Box constructor");
        System.out.println("Height: " + height);
        System.out.println();
    }
}
class WoodBox extends Box {
    double thickness;
    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor");
        System.out.println("Thickness: " + thickness);
        System.out.println();
    }
}

/*public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, width, height, and thickness for the WoodBox: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double thickness = sc.nextDouble();

        WoodBox wb = new WoodBox(length, width, height, thickness);
        
    }
}*/
