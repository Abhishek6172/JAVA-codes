import java.util.*;
interface Employee {
    void getDetails();
}
interface Manager extends Employee {
    void getDeptDetails();
}
class Head implements Manager {
    String empId, empName;
    String deptId, deptName;
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = scanner.nextLine();
        System.out.print("Enter Employee Name: "); 
        empName = scanner.nextLine();
    }
    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department ID: ");
        deptId = scanner.nextLine();
        System.out.print("Enter Department Name: ");
        deptName = scanner.nextLine();
    }
    public void displayAllDetails() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}
public class q4 {
    public static void main(String[] args) {
        Head obj= new Head();
        obj.getDetails();
        obj.getDeptDetails();
        obj.displayAllDetails();
    }
}
