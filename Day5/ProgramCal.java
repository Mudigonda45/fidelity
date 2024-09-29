package Day5;

import java.util.Scanner;
class Calculator {
    public int Addition(int a, int b) {
        return a + b;
    }
    public int Subtraction(int a, int b) {
        return a - b;
    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    public double Division(int a, int b, double[] remainder) {
        remainder[0] = a % b;
        return (double) a / b;
    }
}

public class ProgramCal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the first operand: ");
        int operand1 = scanner.nextInt();
        System.out.print("Enter the second operand: ");
        int operand2 = scanner.nextInt();
        Calculator calculator = new Calculator();
        switch (operator) {
            case '+':
                int sum = calculator.Addition(operand1, operand2);
                System.out.println("Result of " + operand1 + " + " + operand2 + " is " + sum + ".");
                break;

            case '-':
                int difference = calculator.Subtraction(operand1, operand2);
                System.out.println("Result of " + operand1 + " - " + operand2 + " is " + difference + ".");
                break;

            case '*':
                int product = calculator.Multiplication(operand1, operand2);
                System.out.println("Result of " + operand1 + " * " + operand2 + " is " + product + ".");
                break;

            case '/':
                if (operand2 != 0) {
                    double[] remainder = new double[1]; // Array to store remainder
                    double quotient = calculator.Division(operand1, operand2, remainder);
                    System.out.println("Result of " + operand1 + " / " + operand2 + " is " + (int) quotient + ".");
                    System.out.println("Remainder = " + (int) remainder[0]);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}

