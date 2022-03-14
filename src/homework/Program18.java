package homework;
/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        maths();

    }
    public static void maths(){
        int first;
        int second;
        System.out.print("Input first number: ");
        Scanner a = new Scanner(System.in);
        first=a.nextInt();
        System.out.print("Input second number: ");
        second=a.nextInt();
        System.out.println(first +"+"+ second + "="+ (first+second));
        System.out.println(first +"-"+ second + "="+ (first-second));
        System.out.println(first +"*"+ second + "="+ (first*second));
        System.out.println(first +"/"+ second + "="+ (first/second));

    }

}
