package JAVA.java_class2;
import java.util.*;
public class q6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Size of the matrix:- ");
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
    
            System.out.print("Enter the elements of the matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int first_sum= 0;
            int second_sum = 0;
            
            for (int i = 0; i < n; i++) {
                first_sum += matrix[i][i];
                second_sum+= matrix[i][n - 1 - i];
            }
            System.out.println("Sum of the primary diagonal: " + first_sum);
            System.out.println("Sum of the secondary diagonal: " + second_sum);
 
        }
    }