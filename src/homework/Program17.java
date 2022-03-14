package homework;

/*17. Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
*/

import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {
        dectobinary();

    }

    public static void dectobinary(){
        int a;
        String binary;
        System.out.print("Enter the number= ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        binary = Integer.toBinaryString(a);
        System.out.println("Binary number is = " +binary);

    }
}
