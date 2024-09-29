package Day5;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value for y: ");
        int y = scanner.nextInt();
        boolean result = x < y;
        if (result) {
            System.out.println(x + " is lesser than " + y);
        } else if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(x + " is greater than " + y);
        }
    }
}
