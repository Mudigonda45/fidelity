package Day5;

import java.util.Scanner;

import static java.util.Scanner.*;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Firstname = scanner.nextLine();
        System.out.print("Enter your name: ");
        String lastname = scanner.nextLine();
        System.out.println(Firstname + "" +lastname );

    }
}
