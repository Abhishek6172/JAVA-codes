package JAVA.java_class2;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int evencount=0;
int oddcount=0;
System.out.print("Enter 10 numbers:- ");

for (int i = 0; i < 10; i++) {
    int num=sc.nextInt();
            if (num % 2 == 0) {
              evencount++;
            } else {
                oddcount++;
            
            }
        }
        System.out.println("Number of even numbers: " + evencount);
        System.out.println("Number of odd numbers: " + oddcount);
    }
    }