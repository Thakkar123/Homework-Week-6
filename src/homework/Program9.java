package homework;

//9. Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        String str;
        System.out.println("Type your sentence below: ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        str = str.toUpperCase();
        System.out.println(str);


    }
}
