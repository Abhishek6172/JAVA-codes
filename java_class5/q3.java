import java.util.*;
interface Employee {
    double earnings();
    double deductions();
    double bonus();
}
class Manager implements Employee {
    double basicSalary;
    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double earnings() {
        return basicSalary + (0.8 * basicSalary);
    }
    public double deductions() {
        return 0.12 * basicSalary;
    }
    public double bonus(){
        return 0.1 * basicSalary;
    }
    }

class Substaff extends Manager {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }
    public double bonus() {
        return 0.5 * basicSalary;
    }
}
public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary of the substaff: ");
        double basicSalary = scanner.nextDouble();
        Substaff substaff = new Substaff(basicSalary);
        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deductions: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());
    }

}
