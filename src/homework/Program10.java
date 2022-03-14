package homework;

/*
10. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        table();

    }

    public static void table() {
        int p;
        System.out.print("Input number to display table: ");
        Scanner s = new Scanner(System.in);
        p = s.nextInt();

        for (int n = 0; n < 10; n++) {
            System.out.println(p + "X" + (n + 1) + " = " + (p * (n + 1)));

        }

    }
}
