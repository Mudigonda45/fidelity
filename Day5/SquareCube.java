package Day5;

import java.util.Scanner;

public class SquareCube {
    static double Square(double number) {

        return number * number;
    }
    static double Cube(double number) {

        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double square = Square(number);
        double cube = Cube(number);
        System.out.println("Square of " + number + " is " + square);
        System.out.println("Cube of " + number + " is " + cube);
    }
}
