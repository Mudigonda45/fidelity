import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Account a1=new Account();
      a1.accno=1;
      a1.name="ram";
      a1.balance=1000;
      a1.deposit(500);
      a1.withdraw(300);
      Account a2=new Account();
      a2.accno=2;
      a2.name="ram";
      a2.balance=100;
      a2.deposit(500);
      a2.withdraw(30);
      System.out.println(a1.toString());
      System.out.println(a2.toString());
      System.out.println(a1.balanceAmount());

    }
}