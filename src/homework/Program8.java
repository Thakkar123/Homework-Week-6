package homework;
//8. Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {

        float a, b, h;
        System.out.println("please enter the base of the triangle");
        Scanner s = new Scanner(System.in);
        b = s.nextFloat();
        System.out.println("please enter the height of the triangle");
        h = s.nextFloat();
        a = (b * h) / 2;
        System.out.println("Area of triangle is = " + a);


    }
}
