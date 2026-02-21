import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        double result;

        if (op.equals("+")) 
        {
            result = x + y;
        } 
        else if (op.equals("-")) 
        {
            result = x - y;
        } 
        else if (op.equals("*")) 
        {
            result = x * y;
        } 
        else if (op.equals("/")) 
        {
            if (y == 0) 
            {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
            result = x / y;
        } 
        else 
        {
            System.out.println("Error: Unknown operator.");
            return;
        }
        System.out.println("Result: " + result);
    }
}