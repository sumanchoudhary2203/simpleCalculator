//Simple Java Calculator that performs addition and subtraction using user
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operator: (+ or - ): ");
        char operator = sc.next().charAt(0);

        double result;

        if (operator == '+'){
            result = num1 + num2;
        }
        else if (operator == '-'){
            result = num1 - num2;
        }
        else {
            System.out.println("Invalid operator");
            return;
        }
        System.out.println("Result: " + result);
    }
}
