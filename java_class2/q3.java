package JAVA.java_class2;
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Sorted numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

        }
    }