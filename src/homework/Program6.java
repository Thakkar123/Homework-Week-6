package homework;
/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
*/
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
       double A,R;
       double PI = 3.14;
        System.out.print(" Enter the radius value below to calculate the area:");
        Scanner b = new Scanner(System.in);  // scanner class
        R = b.nextDouble();
        A = PI*R*R;
        System.out.println("Area is = "+A);
        }
}
