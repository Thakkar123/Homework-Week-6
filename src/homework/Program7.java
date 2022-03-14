package homework;
/*
7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
*/

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        double F,C;
        System.out.print("Please enter the temperature in Fahrenheit : ");
        Scanner t = new Scanner(System.in);
        F= t.nextDouble();
        C = (F-32)*5/9;
        System.out.println("Celsius Temperature is ="+C);

    }
}
