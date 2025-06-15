package JAVA.java_class2;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int num[] = new int[n];
        int counts[] = new int[n];

        System.out.print("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (counts[i] == 0) { 
                int count = 1;
                for (int j = i +1; j < n; j++) {
                    if (num[j] == num[i]) {
                        count++;
                        counts[j] = -1;
                    }
                }
                System.out.println("The number "+num[i] + " is repeated : " + count + " times");
            }
        }
    }
}