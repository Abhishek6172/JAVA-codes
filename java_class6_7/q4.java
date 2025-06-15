package JAVA.java_class6_7;
import java.util.Scanner;

class NegativeNumberException extends Exception
{
    NegativeNumberException(String s) 
    {
        super(s);
    } 
}
public class q4 {
    static void processInput(int num) throws NegativeNumberException
    { 
        if(num<0)
           throw new NegativeNumberException("Number Entered is a Negative Number");  
        else
           System.out.println("The Number "+(double)num+" is Positive");
    }
    public static void main(String[] args) 
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try
        {
            int input = sc.nextInt();
            sc.close();
            processInput(input);
        } 
        catch(NegativeNumberException e)
        {
            System.out.println("Exception Occured "+e);
        }
    }
}