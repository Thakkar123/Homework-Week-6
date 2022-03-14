package homework;
/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
*/

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        average();
    }

    public static void average() {
        int a, b, c, d;
        System.out.println(" Please enter three numbers");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = (a + b + c) / 3;
        System.out.println("Average of three numbers is =" + d);

    }
}
