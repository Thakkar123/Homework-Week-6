package homework;
/*
19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
*/

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        String str;
        System.out.println("Type your sentence below: ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        str = str.toLowerCase();
        System.out.println(str);

    }
}
