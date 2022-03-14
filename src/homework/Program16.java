package homework;
/*
16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101

*/

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        binary();
    }

    public static void binary() {
        int a, b;
        System.out.println(" Please enter the first binary number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt(2);
        System.out.println(" Please enter the second binary number");
        b = s.nextInt(2);
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(a + b));


    }
}




